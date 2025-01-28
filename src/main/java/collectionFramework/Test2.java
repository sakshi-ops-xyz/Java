package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String args[])
    {
        List<Integer> i= List.of(2,3,4);

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");


//        for (String elem : arr) {
//            if (elem.equals("One")) {
//                arr.remove(elem);              // concurrent modification exception
//            }
//            System.out.println(elem);
//        }

//        Iterator<String> iter=arr.iterator();
//        while(iter.hasNext()) {
//            String str= iter.next();           // concurrent modification exception
//            if(str=="One") {
//                arr.remove(str);
//            }
//        }

        arr.removeIf(list -> list.equals("One"));

        System.out.println(arr);

    }
}


