package sockets.clientServer3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client to establish connection...");
            ServerSocket serverSocket=new ServerSocket(9806);
            Socket socket=serverSocket.accept();
            System.out.println("Connection established!");

            // Getting input from client
            InputStream inputStream=socket.getInputStream();
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            int x=dataInputStream.readInt();
            System.out.println("Data got from client!");

            // Server logic for output
            int ans=1;
            for(int i=x; i>0; i--) {
                ans*=i;
            }

            // Sending data to client
            OutputStream outputStream=socket.getOutputStream();
            DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
            dataOutputStream.writeInt(ans);
            System.out.println("Sent data to client!");

            // Closing socket after connectinon
            inputStream.close();
            outputStream.close();
            socket.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
