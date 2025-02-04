package sockets.multipleClient1;

import Arrays.Arr;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class Logic extends Thread {
    Socket socket;

    public Logic(Socket socket) {
        this.socket=socket;
    }

    public void run() {
        System.out.println("New client connected in thread "+Thread.currentThread().getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            while (true) {
                // Getting input from client
                int x = dataInputStream.readInt();
                if(x == -1) break;
                System.out.println("Data got from client!");

                // Server logic for output
                int ans = 1;
                for (int i = x; i > 0; i--) {
                    ans *= i;
                }

                // Sending data to client
                dataOutputStream.writeInt(ans);
                System.out.println("Sent data to client!");
            }
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            // Closing socket after connectinon
            try {
                if(inputStream!=null) inputStream.close();
                if(outputStream!=null) outputStream.close();
                socket.close();
                System.out.println("Connection closed from server side for client running in thread: "+Thread.currentThread().getName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MyServer {
    static List<Integer> l=new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Waiting for the client to establish connection...");
        ServerSocket serverSocket=null;
        l.add(10);
        System.out.println(MyServer.l);


        try {
            serverSocket=new ServerSocket(9806);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while(true) {
            try {
                Logic logic=new Logic(serverSocket.accept());
                logic.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
