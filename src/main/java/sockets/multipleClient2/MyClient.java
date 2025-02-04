package sockets.multipleClient2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
            printWriter=new PrintWriter(socket.getOutputStream(), true);
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));


            while(true) {
                // Getting input and sending to client
                System.out.print("Client: ");
                String client=sc.nextLine();
                printWriter.println(client);

                // Getting output fromm server
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
