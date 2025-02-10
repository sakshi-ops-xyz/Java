package UDP.singleClient;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args)  {

        try (
                // 1. Create a datagram socket (no specific port binding)
                DatagramSocket datagramSocket = new DatagramSocket();  // Binding is optional here
                Scanner sc=new Scanner(System.in);
        ) {

            // 2. Data to be sent
            String s = sc.nextLine();
            byte[] b = s.getBytes();

            // 3. Wrapping data in a packet (Send to the server on port 8906)
            DatagramPacket datagramPacket = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 8906);

            // 4. Sending the packet
            datagramSocket.send(datagramPacket);
            System.out.println("Data sent!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
