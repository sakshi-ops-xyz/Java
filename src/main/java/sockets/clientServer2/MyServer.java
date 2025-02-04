package sockets.clientServer2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client collection...");
            ServerSocket serverSocket=new ServerSocket(9806);
            Socket socket=serverSocket.accept();
            System.out.println("Client Connected!");

            // Getting data from client
            InputStream inputStream=socket.getInputStream();

            // Getting data in a string
            StringBuilder stringBuilder=new StringBuilder();
            char i;
            try {
                while((i = (char)inputStream.read()) != -1) {
                    stringBuilder.append(i);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("Data received from client: "+stringBuilder);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
