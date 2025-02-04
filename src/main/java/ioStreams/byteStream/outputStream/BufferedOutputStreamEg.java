package ioStreams.byteStream.outputStream;

import java.io.*;

public class BufferedOutputStreamEg {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(new File("output.txt")));

        String s="Hello, world";
        byte[] b=s.getBytes();

        for(var i: b) {
            bufferedOutputStream.write(i);         // first write in buffer (optimized way
        }
        bufferedOutputStream.close();
    }
}
