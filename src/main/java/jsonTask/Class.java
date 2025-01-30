package jsonTask;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Class {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Root root=objectMapper.readValue(new File("practice.json"), Root.class);
        System.out.println(root.getErrorData()+" "+root.getMessage());
    }
}
