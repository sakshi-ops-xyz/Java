package sockets.reconnectionn1;

import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        int port = 1234;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());

                // Handle each client in a separate thread
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)
        ) {
            String input;
            while ((input = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(input);
                    long factorial = calculateFactorial(number);
                    writer.println("Factorial of " + number + " is: " + factorial);
                } catch (NumberFormatException e) {
                    writer.println("Invalid input. Please send an integer.");
                }
            }
        } catch (IOException e) {
            System.out.println("Client disconnected: " + socket.getInetAddress());
        }
    }

    private long calculateFactorial(int n) {
        if (n < 0) return -1; // Factorial is not defined for negative numbers
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

