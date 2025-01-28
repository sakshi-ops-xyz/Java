package java8Features.methodReference;
import java.util.*;


public class MyCls {

    public static void print(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(new Integer[]{1, 2, 3, 4});

        // Using lambda function
//        l.forEach(i -> System.out.println(i));

        // using method references      (:: method reference operator)
        l.forEach(MyCls::print);


        // Using set
        Set<Integer> s=new HashSet<>(Arrays.asList(new Integer[]{2,5,10,10}));
        s.forEach(MyCls::print);

        // Using map
        Map<Integer, Integer> x=new HashMap<>() {{
            put(2, 5);
            put(1,3);
        }};

        x.forEach((i,j) -> {
            System.out.println(i + ", " + j);
        });


    }
}
