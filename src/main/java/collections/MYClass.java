package collections;

import java.util.*;


// can make comparator by implmenting comparator interface
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        return t1-integer;
    }
}

public class MYClass {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(40);
        l.add(20);
        l.add(30);

        // Or can implement anonymous class to make comparator
        /*Comparator<Integer> mycomp=new Comparator<Integer>() {    // have to pass integer on both the side in this case
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        }*/

        List<String> l2=new LinkedList<>();
        l2.add("hello");
        l2.add("hi");

        List<Integer> l3=new LinkedList<>();
        l3.add(1);

        // Sorting
        Collections.sort(l, new MyComparator());
        System.out.println(l);

        // Searching
        System.out.println("Index: " + Collections.binarySearch(l2, "hi"));

        // Shuffling
        Collections.shuffle(l);
        System.out.println(l);

        // min and max
        System.out.println("Min: "+Collections.min(l));
        System.out.println("Max: "+Collections.max(l));

        // reversing
        Collections.reverse(l2);
        System.out.println(l2);

        // rotating
        Collections.rotate(l,1);
        System.out.println(l);

        // swapping
        Collections.swap(l, 0, 1);
        System.out.println(l);

        // counting frequency
        System.out.println(Collections.frequency(l, 10));

        // copying
        System.out.println(l);
        System.out.println(l3);
        Collections.copy(l, l3);
        System.out.println(l);
        System.out.println(l3);
    }
}
