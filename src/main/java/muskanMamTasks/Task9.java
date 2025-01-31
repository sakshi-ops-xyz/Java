package muskanMamTasks;

import java.util.HashSet;
import java.util.Set;

//1	"Given a String, find the first repeated character in it using Stream functions?
//String input = ""Java Hungry Blog Alive is Awesome"";"

public class Task9 {
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";

        Set<Character> seen = new HashSet<>();

        Character firstRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .findFirst()
                .orElse(null);

        System.out.println(firstRepeated);
    }
}
