package ioStreams.charStream.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEg {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader(new File("file.txt"));
        int c;

        while((c=fileReader.read()) != -1) {
            System.out.println((char)c);
        }
    }
}
