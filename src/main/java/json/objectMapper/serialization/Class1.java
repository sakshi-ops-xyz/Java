package json.objectMapper.serialization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.roll=roll;
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll() {
        return this.roll;
    }
}

public class Class1 {
    public static void main(String[] args) {
        Student s1=new Student("Sakshi", 1);
        Student s2=new Student("Aditya", 2);
        Student s3=new Student("Anjani", 3);


        // Java object to Json
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);


        // 1. Json string
        try {
            String jsonString=objectMapper.writeValueAsString(s1);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

        // 2. Json bytes array
        try {
            byte[] b=objectMapper.writeValueAsBytes(s1);
            System.out.println(Arrays.toString(b));
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

        // 3. Json file
        try {
            objectMapper.writeValue(new File("Test.json"), s1);
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }

        // 4. Json Output Stream
        try (FileOutputStream outputStream = new FileOutputStream("output.json")) {
            objectMapper.writeValue(outputStream, s1);
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
