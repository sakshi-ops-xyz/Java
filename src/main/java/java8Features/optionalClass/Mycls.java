package java8Features.optionalClass;

import java.util.Optional;

public class Mycls {
    public static Optional<String> getName() {
        String name="Sam";
        return Optional.ofNullable(null);      // ofNullable()  (if know that the return value can be null)                             //        return Optional.of(name);

    }
    public static void main(String[] args) {
        Optional<String> s=getName();

        // is present method (return bool value)
        if(s.isPresent()) {
            System.out.println(s.get());   // get method to get name in string
        }
        s.ifPresent(System.out::println);   // if present method (take consumer as param)

        System.out.println(s.orElse("NA"));           // if null then default value

    }
}
