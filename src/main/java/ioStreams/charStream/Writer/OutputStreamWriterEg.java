package ioStreams.charStream.Writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEg {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("output.txt"));

        outputStreamWriter.append("hELLO");
        outputStreamWriter.close();
    }
}
