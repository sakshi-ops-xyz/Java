package UDP.singleClient2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {

        try (
                DatagramSocket datagramSocket = new DatagramSocket();
                Scanner sc = new Scanner(System.in);
        ) {
            while (true) {
                String s = sc.nextLine();
                byte[] b = s.getBytes();

                DatagramPacket datagramPacket = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 8906);
                datagramSocket.send(datagramPacket);
                System.out.println("You: "+ s);

                byte[] b2 = new byte[1024];
                DatagramPacket datagramPacket1 = new DatagramPacket(b2, b2.length);
                datagramSocket.receive(datagramPacket1);

                String receivedResponse = new String(datagramPacket1.getData(), 0, datagramPacket1.getLength());
                System.out.println("Received from server: " + receivedResponse);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
