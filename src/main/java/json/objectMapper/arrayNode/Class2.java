package json.objectMapper.arrayNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

public class Class2 {
    public static void main(String[] args) {
        // Using various methods of JSON node (ArrayNode)
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode;
        ArrayNode arrayNode = null;

        try {
            // Using a public API to fetch a JSON response (this is an array of objects)
            URL url = new URL("https://jsonplaceholder.typicode.com/todos");  // URL returns an array of objects
            jsonNode = objectMapper.readTree(url); // Parse the JSON response

            // Check if jsonNode is an ArrayNode
            if (jsonNode.isArray()) {
                arrayNode = (ArrayNode) jsonNode;
                System.out.println("Array Node: " + arrayNode);
            } else {
                System.out.println("The JSON is not an array.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 1. Method to access elements
        System.out.println("\nAccessing first element in the array:");
        System.out.println(arrayNode.get(0));  // Accessing first element of the array

        System.out.println("\nAccessing second element as text:");
        System.out.println(arrayNode.get(1).asText());  // Converting second element to text

        // 2. Traversing array node
        System.out.println("\nTraversing JSON array by loop:");
        for (JsonNode item : arrayNode) {
            System.out.println(item);  // Iterating over each item (JsonNode) in the array
        }

        System.out.println("\nTraversing using iterator:");
        Iterator<JsonNode> elements = arrayNode.elements();  // Using iterator for ArrayNode
        while (elements.hasNext()) {
            JsonNode element = elements.next();
            System.out.println(element);
        }

        // 3. Manipulating ArrayNode
        arrayNode.add("New Value");  // Adding a new value (String) to the array
        arrayNode.remove(0);  // Removing the first element (index 0)

        System.out.println("\nArray after manipulation:");
        for (JsonNode item : arrayNode) {
            System.out.println(item);  // Traversing the array after manipulation
        }
    }
}
