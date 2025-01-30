package json.practice;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

class User {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class Class1 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://jsonplaceholder.typicode.com/todos");
            ObjectMapper objectMapper=new ObjectMapper();
            User[] u=objectMapper.readValue(url, User[].class);
            for(var i: u) {
                System.out.println(i.getId()+" "+i.getUserId()+" " +i.getTitle()+" "+i.isCompleted());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
