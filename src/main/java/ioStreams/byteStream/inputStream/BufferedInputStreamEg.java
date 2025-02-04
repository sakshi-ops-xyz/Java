package ioStreams.byteStream.inputStream;

import java.io.BufferedInputStream;
import java.io.*;

public class BufferedInputStreamEg {
    public static void main(String[] args) throws IOException {
//        BufferedInputStream bufferedInputStream=new BufferedInputStream(System.in);
//        System.out.println("Enter ur name: ");
//        StringBuilder name = new StringBuilder();
//        int c;
//        while((c=bufferedInputStream.read())!='\n') name.append((char) c);
//        String ab = name.toString();
//        System.out.println(ab);


        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("file.txt")));
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
            System.out.println("xyz");
            System.out.print(new String(buffer, 0, bytesRead));
        }

    }
}
