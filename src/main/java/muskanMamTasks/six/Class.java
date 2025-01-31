package muskanMamTasks.six;

//"How to find duplicate elements in a given integers list in java using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);"

import java.util.*;
import java.util.stream.Collectors;

public class Class {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = myList.stream().filter(n -> !seen.add(n)).distinct().collect(Collectors.toList());

        System.out.println(duplicates);


    }
}
