package ioStreams.charStream.Reader;

import java.io.*;

public class InputStreamReaderEg {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("file.txt"));

        int c;
        while((c=inputStreamReader.read()) != -1) {
            System.out.println((char) c);
        }
    }
}
