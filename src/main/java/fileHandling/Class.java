package fileHandling;

import java.io.*;

public class Class {
    public static void main(String[] args) throws IOException {
        // 1. Creation
        File file=new File("demo.txt");
        System.out.println(file.createNewFile());

        // 2. Writing in file
        if(file.canRead()) {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();
            bufferedWriter.write("Good Morning");
            bufferedWriter.append(" Good Afternoon");
            bufferedWriter.close();
        }

        // 3. Reading from file
        if(file.canRead()) {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String s;
            while((s=bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        }

        // 4. Delete
        file.deleteOnExit();
        // file.delete();


    }
}
