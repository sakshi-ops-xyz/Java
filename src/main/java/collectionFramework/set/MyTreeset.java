package collectionFramework.set;

import java.util.TreeSet;

public class MyTreeset {
    public static void main(String[] args) {
        TreeSet <Integer> t=new TreeSet<>();

        // adding elements in tree set
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(20);
        t.add(40);
        System.out.println(t);


        // for getting element less or equal to or more or equal to
        System.out.println(t.ceiling(35));
        System.out.println(t.floor(35));
        // for getting element strictly less or more
        System.out.println(t.lower(30));
        System.out.println(t.higher(30));
    }
}
