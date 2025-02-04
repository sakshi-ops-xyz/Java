package sockets.clientServer1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import static java.lang.Thread.sleep;

public class MyServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server Socket Waiting...");
            ServerSocket serverSocket=new ServerSocket(9806);
            // This call blocks until data is received from the server.
            // Java does not show "BLOCKED" for I/O operations like accept(); instead, it considers them RUNNABLE (waiting on system call).
            Socket socket=serverSocket.accept();
            System.out.println("Client Connected");

        } catch(IOException e) {
            System.out.println(e);
        }


//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    System.out.println(Thread.currentThread().getState());
//                    System.out.println("Server Socket Waiting...");
//                    ServerSocket serverSocket=new ServerSocket(9806);
//                    Socket socket=serverSocket.accept();         // this will block/wait the process/thread to wait for the incoming connection
//                    // Java does not show "BLOCKED" for I/O operations like accept(); instead, it considers them RUNNABLE (waiting on system call).
//
//                } catch(IOException e) {
//                    System.out.println(e);
//                }
//            }
//        });
//
//        thread.start();
//        try {
//            sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(thread.getState());
    }
}
