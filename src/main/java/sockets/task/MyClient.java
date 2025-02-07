package sockets.task;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class MyClient {
    public static void main(String[] args) {

        Socket socket;

        try {
            socket=new Socket("localhost", 9806);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(
                DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
                ) {

            System.out.println("Client Connected To Server.");
            int x=5;

            dataOutputStream.writeInt(x);
            System.out.println(dataInputStream.readInt());

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if(socket.isClosed()) System.out.println("true");
        }
    }
}
