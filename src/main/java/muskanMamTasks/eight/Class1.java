package muskanMamTasks.eight;

//"Given a list of integers, find the total number of elements present in the list using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);"

import java.util.*;

public class Class1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        long x=myList.stream().count();
        System.out.println(x);
    }
}
