package java8Features.functionalInterfacee;

import java.util.function.Function;

public class fuctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> f1= s -> s.length();
        Function<Integer, Integer> f2= s -> s*2;

        // apply method (abstract method)
//        System.out.println(f1.apply("Hello"));

        // andThen() and compose() methods (default method)
        Function<String, Integer> f3=f1.andThen(f2);
        System.out.println(f3.apply("Hello"));

        // identity() method (Static method)    (return input as it is)
        Function<String, String> f4=Function.identity();
        System.out.println(f4.apply("Good morning"));

    }
}
