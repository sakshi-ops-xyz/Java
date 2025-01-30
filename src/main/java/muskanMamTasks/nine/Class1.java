package muskanMamTasks.nine;

//"Given a list of integers, find the maximum value element present in it using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);"

import java.util.*;
import java.util.function.BinaryOperator;


public class Class1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Optional<Integer> o=myList.stream().reduce((a, b) -> a>b?a:b);
        if(o.isPresent()) {
            System.out.println(o.get());
        }
    }
}
