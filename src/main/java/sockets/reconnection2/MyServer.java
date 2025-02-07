package sockets.reconnection2;
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

class ClientHandler extends Thread {
    private Socket socket;
    private int clientId;

    public ClientHandler(Socket socket, int clientId) {
        this.clientId=clientId;
        this.socket=socket;
    }

    @Override
    public void run() {
        Bg bg=new Bg(socket);
        bg.start();
        try {
            bg.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class MyServer {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        int clientId=1;

        try {

            serverSocket=new ServerSocket(9806);
            System.out.println("Server started!");

            while(true) {
                socket=serverSocket.accept();
                System.out.println("Client connected!");
                ClientHandler clientHandler=new ClientHandler(socket, clientId);
                clientId++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
