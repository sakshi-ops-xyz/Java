package json.objectMapper.objectNode;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

public class Class1 {
    public static void main(String[] args) {
        // Using various methods of JSON node
        ObjectMapper objectMapper=new ObjectMapper();
        JsonNode jsonNode;
        ObjectNode objectNode = null;

        try {
            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
            jsonNode = objectMapper.readTree(url); // Parse the JSON response

            // Check if jsonNode is an ObjectNode
            if (jsonNode.isObject()) {
                objectNode = (ObjectNode) jsonNode;
                System.out.println("Object Node: "+objectNode);
            } else {
                System.out.println("The JSON is not an object.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 1. Method to access elements
        System.out.println("\nDate: "+objectNode.get("date"));     // by passing keys and getting values
        System.out.println("\nAs text: "+objectNode.asText());        // assigning node as other different datatypes

        // 2. Traversing object node
        System.out.println("\nTraversing json by loop: ");
        for(var i: jsonNode) {
            System.out.println(i);
        }

        System.out.println("\nTraversing  using iterators: ");
        Iterator<String> fieldNames=objectNode.fieldNames();       // getting an iterators to traverse field names
        while(fieldNames.hasNext()) {
            String s=fieldNames.next();
            System.out.println(objectNode.get(s));
        }

        // 3. Manipualting objectNode
        objectNode.put("Temp Key", "Temp Value");       // key value pair in object node
        objectNode.remove("date");                    // removing using field name

        System.out.println("\nTraversing json by loop after manipulation: ");
        for(var i: jsonNode) {
            System.out.println(i);
        }
    }
}
