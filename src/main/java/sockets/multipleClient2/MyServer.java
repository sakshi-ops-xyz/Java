package sockets.multipleClient2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Logic extends Thread {
    private Socket socket;
    private int clientId;

    public Logic(Socket socket, int clientId) {
         this.socket=socket;
         this.clientId=clientId;
    }

    public void run () {
        System.out.println("Connected with client with id: "+clientId);
        Scanner sc=new Scanner(System.in);
        PrintWriter printWriter=null;
        BufferedReader bufferedReader=null;

        try {
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter=new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            while (true) {
                // getting data from client
                String client=bufferedReader.readLine();
                System.out.println("Client("+clientId+"): "+client);

                // sending data to server
                System.out.print("Server("+clientId+"): ");
                String server=sc.nextLine();
                printWriter.println(server);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bufferedReader != null) bufferedReader.close();
                if(printWriter != null) printWriter.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MyServer {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        int clientId=0;

        try {
            serverSocket=new ServerSocket(9806);
            System.out.println("Waiting for the client to establish connection...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while(true) {
            try {
                Logic logic=new Logic(serverSocket.accept(), clientId++);
                logic.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
