package UDPP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        final int PORT = 9876;  // Server Port

        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            System.out.println("UDP Server is running on port " + PORT);

            byte[] receiveBuffer = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket); // Receive data

                // Extract client data
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                String clientAddress = receivePacket.getAddress().getHostAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received: '" + receivedMessage + "' from " + clientAddress + ":" + clientPort);

                // Echo the message back to the client
                String responseMessage = "Server received: " + receivedMessage;
                byte[] responseData = responseMessage.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length,
                        receivePacket.getAddress(), clientPort);
                socket.send(responsePacket);  // Send response
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

