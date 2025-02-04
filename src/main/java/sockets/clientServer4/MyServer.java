package sockets.clientServer4;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            System.out.println("Waiting for client to establish connection...");
            ServerSocket serverSocket = new ServerSocket(9806);
            socket = serverSocket.accept();
            System.out.println("Connection established!");
            inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            while (true) {
                // Getting input from client
                int x = dataInputStream.readInt();
                if(x == -1) break;
                System.out.println("Data got from client!");

                // Server logic for output
                int ans = 1;
                for (int i = x; i > 0; i--) {
                    ans *= i;
                }

                // Sending data to client
                dataOutputStream.writeInt(ans);
                System.out.println("Sent data to client!");
            }


        } catch (IOException e) {
            System.out.println(e);
        } finally {
            // Closing socket after connectinon
            try {
                if(inputStream!=null) inputStream.close();
                if(outputStream!=null) outputStream.close();
                socket.close();
                System.out.println("Connection closed from server side!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
