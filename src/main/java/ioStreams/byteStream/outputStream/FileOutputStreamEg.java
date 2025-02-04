package ioStreams.byteStream.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEg {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(new File("Output.txt"));

        String string="Hi, sup!";
        byte b[]=string.getBytes();

        for(var i: b) {
            fileOutputStream.write(i);   // write byte by byte
        }

//        fileOutputStream.write(b);
//        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
