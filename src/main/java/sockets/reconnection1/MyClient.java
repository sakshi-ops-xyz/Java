package sockets.reconnection1;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import static java.lang.Thread.sleep;

// reconnection in case of single client and serverr

public class MyClient {

    public static void connectToServer() throws InterruptedException {
        Socket socket = null;
        boolean flag = false;
        DataInputStream dataInputStream = null;

        while(true) {
            try {
                if(!flag)  {
                    socket = new Socket("localhost", 9806);
                    dataInputStream = new DataInputStream(socket.getInputStream());
                    System.out.println("Client connected!");
                    flag = true;
                }
                int x = dataInputStream.readInt();
            } catch (IOException e) {
                flag = false;
                System.out.println("Client disconnected, trying to reconnect...!");
                sleep(3000);
            }
        }
    }

    public static void main(String[] args) {
        try {
            connectToServer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
