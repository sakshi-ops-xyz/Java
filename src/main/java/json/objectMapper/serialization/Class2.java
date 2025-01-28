package json.objectMapper.serialization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;
import java.util.Map;

class Student2 {
    private String name;
    private int roll;

    public Student2(String name, int roll) {
        this.name=name;
        this.roll=roll;
    }
}

enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Class2 {
    public static void main(String[] args) {
        // Handling different types of datatypes
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Student s=new Student("Sakshi", 1);

        // 1. List
        List<?> l=List.of("A", "B", "C", 1, 2, s);
        try {
            String jsonString=objectMapper.writeValueAsString(l);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

        // 2. Enums / Arrays
        Color[] color=Color.values();
//        Color color= Color.BLUE;
        try {
            String jsonString=objectMapper.writeValueAsString(color);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

        // 3. Maps
        Map<String, List<String>> m=Map.of("Fruits", List.of("Apple", "Banana"), "Vegetable", List.of("Cabbage", "Carrot"));
        Map<Integer, Map<String, List<String >>> m3=Map.of(1, m, 2, m);
        List<Map<String, List<String>>> l2=List.of(m, m);
        try {
            String jsonString=objectMapper.writeValueAsString(m3);
            String jsonString2=objectMapper.writeValueAsString(l2);
            System.out.println(jsonString);
            System.out.println(jsonString2);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

    }
}
