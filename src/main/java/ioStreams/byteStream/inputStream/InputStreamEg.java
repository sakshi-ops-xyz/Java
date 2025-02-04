package ioStreams.byteStream.inputStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEg {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=System.in;

        System.out.println("Type smthg: ");
        StringBuilder s=new StringBuilder();
        char c;

        while((c=(char)inputStream.read()) !='\n') {
            s.append(c);
        }
        System.out.println(s);
    }
}
