package ioStreams.charStream.Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterEg {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter=new PrintWriter(new OutputStreamWriter(System.out), true);  // true if for flush functionality
        printWriter.println("Hello WOlrd");
        printWriter.print("Yo");
    }
}
