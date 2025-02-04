package sockets.clientServer1;
import java.io.IOException;
import java.net.Socket;

// Simple CLient and server connection

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost", 9806);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
