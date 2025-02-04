package sockets.task;

import jsonTask.Data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        System.out.println("Server Socket Waiting...");

        try(
                ServerSocket serverSocket=new ServerSocket(9806);
                Socket socket=serverSocket.accept();
                DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
                ) {

            int x=dataInputStream.readInt();
            System.out.println(x);

            int fact=1;

            for(int i=x; i>0; i--) {
                fact*=i;
            }

            dataOutputStream.writeInt(fact);

            System.out.println("Client Connected");

        } catch(IOException e) {
            System.out.println(e);
        }


    }
}
