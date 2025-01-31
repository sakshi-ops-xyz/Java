package json.practice2;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file=new File("practice.json");
        ObjectMapper objectMapper=new ObjectMapper();

        try{
            A a=objectMapper.readValue(file, A.class);
        } catch (IOException e) {
            System.out.println("hey");
            throw new RuntimeException(e);
        }
    }
}
