package muskanMamTasks.four;

//"Given a list of integers, find out all the even numbers exist in the list using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> list2=myList.stream().filter(i  -> i%2==0).toList();

        System.out.println(list2);
    }
}