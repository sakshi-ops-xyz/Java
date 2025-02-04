package sockets.clientServer3;

import java.io.*;
import java.net.Socket;
import java.util.*;

// Sending data to sever and server sending response to client

public class MyClient {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client connection...");
            Socket socket=new Socket("localhost", 9806);
            System.out.println("Connection established!");

            // Getting int as input
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();

            // Sending to server
            OutputStream outputStream=socket.getOutputStream();
            DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
            dataOutputStream.writeInt(x);
            System.out.println("Data sent to server!");

            // Getting from server
            InputStream inputStream=socket.getInputStream();
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            int y=dataInputStream.readInt();
            System.out.println("Factorial got from server: "+y);

            // Closing the socket after communication end
            dataOutputStream.close();
            inputStream.close();
            socket.close();
            System.out.println("Connection closed from client side");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
