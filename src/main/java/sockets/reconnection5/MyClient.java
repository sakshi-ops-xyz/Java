package sockets.reconnection5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        int port = 1234;
        int retryCount = 0;
        final int MAX_RETRIES = 5;

        while (true) {
            try (Socket socket = new Socket("localhost", port)) {
                System.out.println("Connected to server.");

                retryCount = 0;

//                Thread readerThread = new Thread(new ServerReader(socket));
//                Thread writerThread = new Thread(new UserWriter(socket));
//
//                readerThread.start();
//                writerThread.start();
//
//                readerThread.join();

                ServerReader serverReader=new ServerReader(socket);
                serverReader.start();
                System.out.println("1111111");
                UserWriter userWriter=new UserWriter(socket);
                userWriter.start();
                System.out.println("222222222");

                serverReader.join();
                userWriter.stopThread();
                userWriter.join();

            } catch (IOException | InterruptedException e) {
                retryCount++;
                System.out.println("Connection lost. Connection. Count: "+retryCount);

                if (retryCount >= MAX_RETRIES) {
                    System.out.println("Max retries reached...");
                    break;
                }

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ignored) {}
            }
        }
    }
}

class ServerReader extends Thread {
    private BufferedReader reader;

    public ServerReader(Socket socket) throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        System.out.println("33333333");

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

class UserWriter extends Thread {
    private PrintWriter writer;
    private Scanner scanner;
    private boolean running;

    public UserWriter(Socket socket) throws IOException {
        this.writer = new PrintWriter(socket.getOutputStream(), true);
        this.scanner = new Scanner(System.in);
        this.running = true;
    }

    public void stopThread() {
        this.running=false;
    }


    @Override
    public void run() {
        System.out.println("4444444");

        try {
            while (running) {
                System.out.println("Is Running: "+running);
                if (scanner.hasNextLine() && running) {
                    String input = scanner.nextLine();
                    writer.println(input);
                    System.out.println(Thread.currentThread().getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
