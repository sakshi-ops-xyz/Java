package sockets.clientServer5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;
        Socket socket=null;
        ServerSocket serverSocket=null;

        try {
            System.out.println("Server started!");
            serverSocket=new ServerSocket(9806);
            socket=serverSocket.accept();
            System.out.println("Client connected.");

            while (true) {
                // getting data from client
                bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String client=bufferedReader.readLine();
                System.out.println("Client: "+client);

                // sending data to server
                System.out.print("Server: ");
                String server=sc.nextLine();
                printWriter=new PrintWriter(socket.getOutputStream(), true);
                printWriter.println(server);

            }
        } catch (IOException e) {
            System.out.println(e);
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
