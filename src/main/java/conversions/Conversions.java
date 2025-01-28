package conversions;

import java.util.Arrays;

public class Conversions {
    public void asciiToByte(String str) {
        byte[] bytes = str.getBytes();    // Using getBytes() method to store in a byte array
//        byte bytes2= Byte.parseByte("123");
//        System.out.println(bytes2);
        System.out.println(Arrays.toString(bytes));     // To print Array as string or can use for loop
    }

    public void byteToAscii(byte bytes[]) {
        String str = new String(bytes);
        System.out.println(str);
    }

    public void byteToHex(byte bytes[]) {
        // (String.format("%02X ", char)->convert char to hex value)
        StringBuilder hexStr = new StringBuilder();
        for (var m : bytes) {
            hexStr.append(String.format("%02X", m));
        }
        System.out.println(hexStr);
    }

    public void hexToByte(String hexStr) {
        // Ensure the string length is even
        if (hexStr.length() % 2 != 0) {
            System.out.println("Invalid hex string length (must be even).");
            return;
        }

        byte[] ans = new byte[hexStr.length() / 2];

        for (int i = 0; i < ans.length; i++) {
            int index = i * 2;

            // Using parseInt() method of Integer class to convert hex to int
            int val = Integer.parseInt(hexStr.substring(index, index + 2), 16);
            ans[i] = (byte) val;
        }

        // Printing the required Byte Array
        System.out.println(Arrays.toString(ans));
    }
    public void asciiToHex(String str) {
        StringBuilder hexStr=new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            hexStr.append(String.format("%02X", (int)str.charAt(i)));
        }
        System.out.println(hexStr);
    }

    public void hexToAscii(String hexStr) {
        byte[] ans=new byte[hexStr.length()/2];
        for(int i=0; i<ans.length; i++) {
            int index=i*2;

            int val=Integer.parseInt(hexStr.substring(index, index+2), 16);
            ans[i]=(byte)val;
        }
        System.out.println(new String(ans));
    }
}

class Main {
    // Method for Bytes ASCII and Hex Conversion Example
    public static void main(String gg[]) {
        Conversions c=new Conversions();
        String str = "Hello World";
        byte[] bytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};  // Hello world in bytes
        String hexStr="48656C6C6F20576F726C64"; // Hello world in hex

        System.out.println("ASCII to Bytes: ");
        c.asciiToByte(str);
        System.out.println("Bytes to ASCII: ");
        c.byteToAscii(bytes);
        System.out.println("Bytes to Hex: ");
        c.byteToHex(bytes);

        System.out.println("Hex to Bytes");
        c.hexToByte(hexStr);
        System.out.println("ASCII to Hex");
        c.asciiToHex(str);
        System.out.println("Hex to ASCII");
        c.hexToAscii(hexStr);

        Integer i=1234;
        System.out.println(Integer.toHexString(i));
        Byte b= 42;
    }

}
