package sockets.reconnection1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Bg extends Thread {
    private Socket socket;

    public Bg(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            while(true) {
                dataOutputStream.writeInt(1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class MyServer {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;

        try {
            serverSocket=new ServerSocket(9806);
            System.out.println("Server started!");
            socket=serverSocket.accept();
            System.out.println("Client connected!");

            Bg bg=new Bg(socket);
            bg.start();
            bg.join();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
