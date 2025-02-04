package sockets.clientServer5;

// messaging from client to server and vice versa (single client and server)

import com.fasterxml.jackson.core.JsonToken;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter printWriter=null;
        BufferedReader bufferedReader=null;
        Socket socket=null;

        try {
            System.out.println("Request sent for connection.");
            socket=new Socket("localhost", 9806);

            while(true) {
                // Getting input and sending to client
                System.out.print("Client: ");
                String client=sc.nextLine();
                printWriter=new PrintWriter(socket.getOutputStream(), true);
                printWriter.println(client);

                // Getting output fromm server
                bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String server=bufferedReader.readLine();
                System.out.println("Server: "+server);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(printWriter!= null) printWriter.close();
                if(bufferedReader != null) bufferedReader.close();
                if(socket != null) socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
