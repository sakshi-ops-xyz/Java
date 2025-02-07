package java8Features.stream;
import inheritance.singleLevel.A;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEg {
    public static void main(String[] args) {

        // Stream Creation
//        List<Integer> x=List.of(1,3,5);
//        Stream<Integer> stream1=x.stream();
//
//        Integer a[]= {1,2,3};
//        Stream<Integer> stream2=Arrays.stream(a);
//
//        Stream<Integer> stream3=Stream.of(1,3,5);
//
//        Stream<Integer> stream4=Stream.iterate(2, i -> i*i).limit(10);

        // methods
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,8,9,10,10,11,12,13,14,15,16,17,18,19,20));
        Stream<Integer> stream=list.stream();

        List<Integer> outputList=stream.filter(i -> i%2==0).map(i -> i*2).sorted().limit(5).collect(Collectors.toList());
        System.out.println(outputList);

        // reduce method
        Optional<Integer> o=list.stream().reduce((a,b) -> a+b);
        if(o.isPresent()) {
            System.out.println(o.get());
        }

        System.out.println(list.stream().filter(i -> i%2==0).distinct().count());



        // Flat map
        List<List<Integer>> t = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );


        List<Integer> l=t.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(l);


        // Split iterator
        Spliterator<Integer> s1=l.spliterator();
        Spliterator<Integer> s2=s1.trySplit();

        s1.forEachRemaining(System.out::println);
        System.out.println("\n");
        s2.forEachRemaining(System.out::println);


        // parallels tream
        System.out.println("\n");
        l.stream().parallel().forEach(System.out::println);

    }
}
