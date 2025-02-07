package sockets.multipleClient5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Logic extends Thread
{
    private Socket socket;
    private int clientId;

    public Logic(int clientId, Socket socket) {
        this.clientId=clientId;
        this.socket=socket;
    }

    @Override
    public void run() {
        System.out.println("Client "+clientId+" connected to Server");
        Scanner sc=new Scanner(System.in);
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;

        try {
            // outside loop
            printWriter=new PrintWriter(socket.getOutputStream(), true);
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while(true) {
                // getting data from client
                String msg=bufferedReader.readLine();
                System.out.println(msg);
                if (msg == null || msg.equalsIgnoreCase("EXIT")) {
                    // remove client form list (disconnection)
                    System.out.println("Client " + clientId + " disconnected.");
                    MyServer.myMap.remove(clientId);  // Remove client from the map
                    socket.close();
                    break;
                }

                for (Map.Entry<Integer, Socket> entry : MyServer.myMap.entrySet()) {
                    if(socket == entry.getValue()) continue;
                    PrintWriter printWriterTemp=new PrintWriter(entry.getValue().getOutputStream(), true);
                    String editedMsg="Client "+clientId+" : "+msg;
                    printWriterTemp.println(editedMsg);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



// Thread to display switch case in continous manner
class UIThread extends Thread {

    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("1. Chat Application.\n2. Broad-casting to clients.\n3. Uni-casting to particular client.\n4. Close server.");
            System.out.print("Select an option (1-4) : ");

            MyServer.choice=sc.nextInt();

            switch (MyServer.choice) {
                case 1:
                    //                Logic logic=new Logic(clientId, socket);
//                logic.start();
//                clientId++;

                    // this logic should be here
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}


// Tread to implement logic to add new clients to server
class ServerThread extends Thread {

    @Override
    public void run() {
        DataOutputStream dataOutputStream=null;

        ServerSocket serverSocket=null;
        Socket socket=null;
        int clientId=1;

        try {
            serverSocket=new ServerSocket(9806);
            System.out.println("Server started ...");

            while(true) {
                socket=serverSocket.accept();
                MyServer.myMap.put(clientId, socket);
                System.out.println("Connected");

                dataOutputStream=new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeInt(MyServer.choice);

//                Logic logic=new Logic(clientId, socket);
//                logic.start();
//                clientId++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



public class MyServer {
    public static Map<Integer, Socket> myMap = new HashMap<>();
    public static Map<Integer, Thread> myMap2 = new HashMap<>();   // for storing logic threads
    static int choice;

    public static void main(String[] args) {
        ServerThread serverThread=new ServerThread();
        UIThread uiThread=new UIThread();

        serverThread.start();
        uiThread.start();
    }
}
