package json.objectMapper.jsonTree;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Class1 {
    public static void main(String[] args) {

        // Parsing json tree
        String jsonTreeString = "{\n" +
                "  \"id\": 12345,\n" +
                "  \"name\": \"Alice\",\n" +
                "  \"email\": \"alice@example.com\",\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\",\n" +
                "    \"city\": \"New York\",\n" +
                "    \"zipcode\": \"10001\"\n" +
                "  },\n" +
                "  \"skills\": [\"Java\", \"Python\", \"JavaScript\"],\n" +
                "  \"active\": true\n" +
                "}";

        ObjectMapper objectMapper=new ObjectMapper();

        // Parsing from json string
        try {
            JsonNode jsonNode=objectMapper.readTree(jsonTreeString);
            System.out.println(jsonNode);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }

        // Parsing from file
        File f=new File("Test2.json");
        try {
            JsonNode jsonNode=objectMapper.readTree(f);
            System.out.println(jsonNode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Parsing from Input Stream
        try {
            InputStream inputStream= Files.newInputStream(Paths.get("Test2.json"));
            JsonNode jsonNode=objectMapper.readTree(inputStream);
             System.out.println(jsonNode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Parsing from URL
        try {
            URL url=new URL("https://jsonplaceholder.typicode.com/todos/1");
            JsonNode jsonNode=objectMapper.readTree(url);
            System.out.println(jsonNode);
        } catch(IOException e) {
            System.out.println(e);
        }


    }
}









