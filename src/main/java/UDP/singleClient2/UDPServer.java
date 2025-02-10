package UDP.singleClient2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;


public class UDPServer {
    public static void main(String[] args) {

        try (
                DatagramSocket datagramSocket = new DatagramSocket(8906);
                Scanner sc = new Scanner(System.in);
        ) {
            byte[] b = new byte[1024];
            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
                datagramSocket.receive(datagramPacket);

                String receivedData = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println("Received from client: " + receivedData);

                String response = sc.nextLine();
                byte[] b2 = response.getBytes();

                DatagramPacket datagramPacket1 = new DatagramPacket(b2, b2.length, InetAddress.getLocalHost(), 8906);
                datagramSocket.send(datagramPacket1);
                System.out.println("Response sent to client.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
