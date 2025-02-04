package ioStreams.charStream.Reader;

import java.io.*;

public class BufferedReaderEg {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("file.txt"));

        String s;
        while((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
    }
}
