package sockets.reconnection4;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

class ClientHandler extends Thread {
    static ConcurrentHashMap<Integer, Socket> socketMap=new ConcurrentHashMap<>();
    private final Socket socket;
    private final int clientId;

    public ClientHandler(int clientId, Socket socket) {
        this.socket = socket;
        this.clientId = clientId;
        socketMap.put(clientId, socket);
    }

    public void run() {
        try (
                Scanner scanner=new Scanner(System.in);
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter printWriter=new PrintWriter(socket.getOutputStream());
                ) {
            System.out.println("Client "+clientId+" connected to Server!");
            String message;
            while ((message = bufferedReader.readLine()) != null) {
                System.out.println("Received from client " + clientId + ": " + message);
                printWriter.println("Server response: " + message); // Send a response to the client
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


class ReaderThreadd extends Thread {
    @Override
    public void run() {

    }
}

class ClientAcceptor extends Thread {
    Socket socket;

    @Override
    public void run() {
        int clientId=1;

        while(true) {
            try {
                socket=MyServer.serverSocket.accept();
                new ClientHandler(clientId, socket).start();
                clientId++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MyServer {
    static ServerSocket serverSocket;

    public static void main(String[] args) {
        try {
            System.out.println("Socket Started!");
            serverSocket=new ServerSocket(1114);
            ClientAcceptor clientAcceptor=new ClientAcceptor();
            clientAcceptor.start();
            clientAcceptor.join();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
