package sockets.multipleClient3;

// Broadcasting a msg to other clientssss (Like making a group chat that include multiple clients and serer is responsible forbraodcasting themsg from one clientto all)   /// has blocking in loop

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Socket socket=null;
        Scanner sc=new Scanner(System.in);
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;

        try {
            System.out.println("Sending connection req to server ...");
            socket=new Socket("localhost", 9806);
            System.out.println("Connecting with the chatting application (Type EXIT to exit)");
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter=new PrintWriter(socket.getOutputStream(), true);


            while(true) {
                // Getting input and sending to server
                String msg=sc.nextLine();
                if (msg.equalsIgnoreCase("EXIT")) {
                    printWriter.println(msg);  // Send "EXIT" to the server
                    break;
                }
                printWriter.println(msg);

                // Getting output fromm server
                String s=bufferedReader.readLine();
                System.out.println(s);
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
