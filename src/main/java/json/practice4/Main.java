package json.practice4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Root r=objectMapper.readValue(new File("test4.json"), Root.class);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(r);

//        String jsonString=objectMapper.writeValueAsString(r);
//        System.out.println(jsonString);
    }
}
