package collectionFramework.set;

import java.util.HashSet;

public class MyHashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>(20);
        h2.add(10);
        h2.add(20);
        HashSet<Integer> h3=new HashSet<>(h2);


        // for adding in hash set
        h.add(1);
        h.add(1);
        h.add(2);
        h.add(3);

        // concat h2 contents to h
        h.addAll(h2);

        // to traverse
        System.out.println(h);

        // to remove
        System.out.println(h.remove(10));

        // check if element is present or not
        System.out.println(h.contains(1));

        // check if if has all the elements of specified collection
        System.out.println(h.containsAll(h2));

        // to remove all (will remove object of other collection)
        h.removeAll(h2);
        System.out.println(h);

        // to get size
        System.out.println(h.size());

        // to clear
        h.clear();
    }
}
