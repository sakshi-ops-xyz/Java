package ioStreams.byteStream.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEg {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(new File("file.txt"));

        // 1. Method to get available bytes to print
        System.out.println(fileInputStream.available());

        int x;
        // 2. Method to return byte
        while((x = fileInputStream.read()) != -1 ) {
            if(fileInputStream.available() ==12) fileInputStream.skip(5);     // 3. Method to skip n bytes
            System.out.println((char) x);
        }
        // 4. Method to close file
        fileInputStream.close();
    }
}