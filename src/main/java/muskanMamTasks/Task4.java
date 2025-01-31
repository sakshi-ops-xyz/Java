package muskanMamTasks.five;

//"Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

import java.util.*;

public class Task4{
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> list2=myList.stream().filter(i -> i.toString().charAt(0) == '1').toList();
        System.out.println(list2);
    }
}
