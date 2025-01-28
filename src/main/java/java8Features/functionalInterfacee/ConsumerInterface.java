package java8Features.functionalInterfacee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<List<Integer>> c1= i -> {
            for(var x: i) {
                System.out.println(x*10);
            }
        };
        Consumer<List<Integer>> c2= i -> {
            for(var x: i) {
                System.out.println(x);
            }
        };

//        c1.accept(Arrays.asList(new Integer[]{1, 2, 3, 4}));

        Consumer<List<Integer>> c3=c1.andThen(c2);
        c3.accept(Arrays.asList(new Integer[]{1, 2, 3, 4}));

    }
}
