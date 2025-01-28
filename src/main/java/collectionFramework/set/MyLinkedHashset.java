package collectionFramework.set;

import java.util.LinkedHashSet;

public class MyLinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet <Integer> l=new LinkedHashSet<>();
        LinkedHashSet <Integer> l2=new LinkedHashSet<>(2);
        l2.add(10);
        l2.add(20);

        // to add element
        l.add(1);
        l.add(2);
        l.add(3);

        // to remove element
        l.remove(1);
        l.remove(4);

        // to traverse
        System.out.println(l);

        // to add element of other collection
        l.addAll(l2);
        System.out.println(l);
    }
}
