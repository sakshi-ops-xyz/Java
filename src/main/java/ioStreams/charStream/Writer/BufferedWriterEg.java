package ioStreams.charStream.Writer;

import inheritance.singleLevel.B;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEg {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(new File("output.txt")));

        bufferedWriter.write("Hello World");
        bufferedWriter.newLine();
        bufferedWriter.write("Good Afternoon");

        bufferedWriter.close();
    }
}
