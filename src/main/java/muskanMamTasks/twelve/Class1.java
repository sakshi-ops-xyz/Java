package muskanMamTasks.twelve;

//"Given a list of integers, sort all the values present in it using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);"

import java.util.*;

public class Class1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        List<Integer> l=myList.stream().sorted().toList();
        System.out.println(l);
    }
}


