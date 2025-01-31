package muskanMamTasks;

//"How to find duplicate elements in a given integers list in java using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);"

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> s=myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(s);
    }
}
