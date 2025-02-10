package UDP.singleClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {

        try (
                // 1. Create a datagram socket bound to port 8906 (match the client port)
                DatagramSocket datagramSocket = new DatagramSocket(8906);
        ) {

            // 2. Create a buffer to receive the packet from the sender
            byte[] b = new byte[1024]; // Make sure the buffer is large enough for the incoming data

            // 3. Encapsulate the buffer inside a datagram packet
            DatagramPacket datagramPacket = new DatagramPacket(b, b.length);

            // 4. Waiting for the packet (blocking call until data is received)
            datagramSocket.receive(datagramPacket);

            // 5. Getting value from the packet
            String receivedData = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("Received: " + receivedData);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
