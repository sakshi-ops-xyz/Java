package json.objectMapper.deserialization;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

class Student {
    private String name;
    private int roll;

    public Student() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

public class Class1 {
    public static void main(String[] args) {
        // Json to java object
        byte[] b={123, 13, 10, 32, 32, 34, 110, 97, 109, 101, 34, 32, 58, 32, 34, 83, 97, 107, 115, 104, 105, 34, 44, 13, 10, 32, 32, 34, 114, 111, 108, 108, 34, 32, 58, 32, 49, 13, 10, 125};
        String jsonString = "[{\"name\":\"Sakshi\",\"roll\":1}, {\"name\":\"Aditya\",\"roll\":2}, {\"name\":\"Anjani\",\"roll\":3}]";
        ObjectMapper objectMapper=new ObjectMapper();

        // 1. json string to object
        try {
            Student s=objectMapper.readValue(b, Student.class);
            System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll());
        } catch (Exception e) {
            System.out.println(e);
        }

        // json list of object to java objects
        try {
            Student[] students = objectMapper.readValue(jsonString, Student[].class);
            for (Student s : students) {
                System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // json file to java object
        try {
            Student s=objectMapper.readValue(new File("Test.json"), Student.class);
            System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll());
        } catch (Exception e) {
            System.out.println(e);
        }

        //
        try {
            List<Student> students = objectMapper.readValue(jsonString, new TypeReference<List<Student>>() {});
            for (Student s : students) {
                System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll());
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
