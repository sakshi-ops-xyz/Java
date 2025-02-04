package sockets.clientServer2;
import inheritance.singleLevel.B;
import java.io.*;
import java.net.Socket;

// Sending data to server and server getting data from client

public class MyClient {
    public static void main(String[] args) {
        try {
            System.out.println("Connecting to server socket...");
            Socket socket=new Socket("localhost", 9806);

            // Data to send to the server
            String data="Hey server this is data from my side";
            byte b[]=data.getBytes();

            // Get output stream to send data
            OutputStream outputStream=socket.getOutputStream();
            outputStream.write(b);
            System.out.println("Data sent to server");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
