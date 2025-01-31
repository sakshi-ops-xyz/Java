package muskanMamTasks.ten;

import java.util.HashSet;
import java.util.Set;

public class Class2 {
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
