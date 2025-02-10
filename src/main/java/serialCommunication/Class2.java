package serialCommunication;

// To open the serial port and send data

import gnu.io.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Class2 {
    public static void main(String[] args) throws NoSuchPortException, PortInUseException, UnsupportedCommOperationException, IOException {
        String portName="/dev/ttyUSB0";
        CommPortIdentifier commPortIdentifier=CommPortIdentifier.getPortIdentifier(portName);
        SerialPort serialPort=(SerialPort)commPortIdentifier.open("SerialCommunication", 2000);

        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);


        PrintWriter printWrite=new PrintWriter(serialPort.getOutputStream(), true);
        printWrite.println("Hello WOrld".getBytes());
        System.out.println(323);
        serialPort.close();
    }
}
