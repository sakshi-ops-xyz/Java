package muskanMamTasks;

//Given the list of integers, find the first element of the list using Stream functions?

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Optional<Integer> optional=myList.stream().findFirst();

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
