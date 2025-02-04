package sockets.multipleClient5;

// Broadcasting a msg to other clientssss using sep threads for input and output
// Unicasting to a client

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class Print extends Thread {
    private Socket socket;

    public Print(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        PrintWriter printWriter=null;

        try {
            printWriter=new PrintWriter(socket.getOutputStream(), true);
            while(true) {
                String msg=sc.nextLine();
                if (msg.equalsIgnoreCase("EXIT")) {
                    printWriter.println(msg);  // Sending exitt to the server
                    break;
                }
                printWriter.println(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(printWriter!= null) printWriter.close();
        }

    }
}

class Writer extends Thread {
    private Socket socket;

    public Writer(Socket socket) {
        this.socket=socket;

    }

    @Override
    public void run() {
        BufferedReader bufferedReader=null;

        try {
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while(true) {
                String s=bufferedReader.readLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class MyClient {
    public static void main(String[] args) {
        Socket socket=null;

        try {
            System.out.println("Sending connection req to server ...");
            socket=new Socket("localhost", 9806);
            System.out.println("----Connected with the chatting application, Type EXIT to exit----");

            Print print=new Print(socket);
            Writer write=new Writer(socket);
            print.start();
            write.start();

//            while(true) {}
            // main thread will wait until the below threads have completed their tasks
            print.join();
            write.join();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(socket != null) socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
