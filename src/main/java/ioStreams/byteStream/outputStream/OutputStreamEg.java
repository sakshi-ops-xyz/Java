package ioStreams.byteStream.outputStream;

import java.io.*;

public class OutputStreamEg {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;

        String data = "Hello,Workd";
        byte[] byteData = data.getBytes();

        // 1. To write
        outputStream.write(byteData);
        outputStream.flush();         // 2. Ensures not data remain in buffer

        outputStream.close();         // 3. Closing the file
    }
}
