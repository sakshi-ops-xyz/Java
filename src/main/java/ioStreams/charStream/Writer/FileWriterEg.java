package ioStreams.charStream.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEg {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter(new File("output.txt"));

        fileWriter.write("Hello World!");
        fileWriter.close();
    }
}
