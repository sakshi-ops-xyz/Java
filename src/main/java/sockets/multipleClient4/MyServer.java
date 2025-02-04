package sockets.multipleClient4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
public class MyServer {
    public static Map<Integer, Socket> myMap = new HashMap<>();

    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        int clientId=1;

        try {
            serverSocket=new ServerSocket(9806);
            System.out.println("Server started ...");

            while(true) {
                socket=serverSocket.accept();
                MyServer.myMap.put(clientId, socket);
                Logic logic=new Logic(clientId, socket);
                logic.start();
                clientId++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
