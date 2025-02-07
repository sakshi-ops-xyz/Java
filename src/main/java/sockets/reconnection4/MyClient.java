package sockets.reconnection4;

import java.io.*;
import java.net.*;
import java.util.*;

class WriterThread extends Thread {
    public void run() {
        String input;

        try(
                Scanner sc=new Scanner(System.in);
                PrintWriter printWriter=new PrintWriter(MyClient.socket.getOutputStream());
                ) {
            while(true) {
                input=sc.nextLine();
                printWriter.println(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class ReaderThread extends Thread{

    public void run() {
        String response=null;
        try(
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(MyClient.socket.getInputStream()));
                ) {
            while(true) {
                System.out.println("hello");
                response=bufferedReader.readLine();
                System.out.println("Response: "+response);
                if(response==null) throw new RuntimeException();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class MyClient {
    static volatile Socket socket;

    public static void main(String[] args) {
        try {
            socket=new Socket("localhost", 1113);
            System.out.println("Client connected to server!");
            ReaderThread readerThread=new ReaderThread();
            WriterThread writerThread=new WriterThread();
            readerThread.start();
            writerThread.start();
            readerThread.join();
            writerThread.join();
            System.out.println("hello");
        } catch (IOException e) {
            System.out.println("Client disconnected from Server!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
