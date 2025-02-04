package sockets.multipleClient1;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

// factorial calculation from multi client to server

public class MyClient {
    public static void main(String[] args) {
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Waiting for client connection...");
            socket = new Socket("localhost", 9806);
            System.out.println("Connection established!");
            OutputStream outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            InputStream inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            while (true) {
                // Getting int as input
                System.out.print("Input a number (or input -1 to close connection): ");
                System.out.println(MyServer.l);
                try {
                    int x = sc.nextInt();
                    if (x == -1) {
                        dataOutputStream.writeInt(-1);
                        break;
                    }
                    if(x < 0) {
                        System.out.println("Invalid input!");
                        continue;
                    }

                    // Sending to server
                    dataOutputStream.writeInt(x);
                    System.out.println("Data sent to server!");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    dataOutputStream.writeInt(-1);
                    break;
                }

                // Getting from server
                int y = dataInputStream.readInt();
                System.out.println("Factorial got from server: " + y);
            }


        } catch (IOException e) {
            System.out.println(e);
        } finally {
            // Closing the socket after communication end
            try {
                if(dataInputStream != null) dataInputStream.close();
                if(socket != null) socket.close();
                sc.close();
                System.out.println("Connection closed from client side");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// server to only one client
// broadcast
// retry
