package ioStreams.byteStream.inputStream;
import java.io.*;

public class DataInputStreamEg {
    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(new File("output.txt")));
        dataOutputStream.writeChar('H');
        dataOutputStream.writeInt(100);

        DataInputStream dataInputStream=new DataInputStream(new FileInputStream(new File("output.txt")));
        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.readInt());
    }
}
