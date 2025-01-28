package exceptionHandling.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {

        try {
            FileReader f=new FileReader("xyz");
            BufferedReader f2=new BufferedReader(f);
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("File not found");
        }
    }
}
