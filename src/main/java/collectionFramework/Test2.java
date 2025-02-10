package collectionFramework;

import java.util.*;
import java.lang.*;

public class Test2 {
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<>();

        l.addFirst(10);
        l.add(20);

        Iterator<Integer> i=l.iterator();
        for(var x:  l) {
            l.add(10);
        }

//        Iterable
    }
}


