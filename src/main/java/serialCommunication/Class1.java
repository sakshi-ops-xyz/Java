package serialCommunication;
import gnu.io.*;
import java.util.Enumeration;

// To check ports avaialble

public class Class1 {
    public static void main(String[] args) {
        Enumeration<?> portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            CommPortIdentifier portId = (CommPortIdentifier) portList.nextElement();

            System.out.println("Port: " + portId.getName());
        }
    }
}




