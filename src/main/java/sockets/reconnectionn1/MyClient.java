package sockets.reconnectionn1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1234;
        int retryCount = 0;
        final int MAX_RETRIES = 5;  // Maximum retries before exiting (can be adjusted)

        while (true) {
            try (Socket socket = new Socket(serverAddress, port)) {
                System.out.println("Connected to server.");

                // Reset retry count on successful connection
                retryCount = 0;

                // Start reader and writer threads
                Thread readerThread = new Thread(new ServerReader(socket));
                Thread writerThread = new Thread(new UserWriter(socket));

                readerThread.start();
                writerThread.start();

                // Keep the client running until an exception occurs
                readerThread.join();  // Wait for the reader thread to terminate

            } catch (IOException | InterruptedException e) {
                retryCount++;
                System.out.println("Connection lost. Attempting to reconnect (" + retryCount + "/" + MAX_RETRIES + ")...");

                if (retryCount >= MAX_RETRIES) {
                    System.out.println("Max retries reached. Exiting...");
                    break;  // Stop trying if maximum retries are reached
                }

                try {
                    Thread.sleep(3000);  // Wait before retrying
                } catch (InterruptedException ignored) {}
            }
        }
    }
}

// Reads server messages
class ServerReader implements Runnable {
    private BufferedReader reader;

    public ServerReader(Socket socket) throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println("Server: " + response);
            }
        } catch (IOException e) {
            System.out.println("Disconnected from server.");
        }
    }
}

// Writes user input to server
class UserWriter implements Runnable {
    private PrintWriter writer;
    private Scanner scanner;

    public UserWriter(Socket socket) throws IOException {
        this.writer = new PrintWriter(socket.getOutputStream(), true);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    writer.println(input);
                    System.out.println(Thread.currentThread().getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Error sending message.");
        }
    }
}
