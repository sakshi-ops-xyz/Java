package collectionFramework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();


        // >> Methods inherited from List interface
        // Adding element
        l.add(10);
        l.add(20);

        // Inserting element
        l.add(0, 0);

        // Replacing element
        l.set(0, null);

        // Removing element
        l.remove(0);

        // Getting elements
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Element at " + i + "th index: " + l.get(i));
        }

        System.out.println("\n");

        // >> Methods inherited from Deque interface
        // Adding element
        l2.addFirst(10);
        l2.addFirst(0);
        l2.addLast(20);

        // Peeking elements
        System.out.println("Element at beginning: "+l2.peekFirst());
        System.out.println("Element at last: "+l2.peekLast());

        // Removing elements
        l2.removeFirst();
        l2.removeLast();

        // Getting elements
        for (int i = 0; i < l2.size(); i++) {
            System.out.println("Element at " + i + "th index: " + l2.get(i));
        }

        System.out.println("\n");

        // >> Queue interface methods
        // Peeking only head element
        System.out.println(l2.peek());
//Integer

        // Peeking head element (also removing it)
        System.out.println(l2.poll());

        System.out.println("\n");

        // Heterogeneous lined list
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add("hello");

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }


        // Iterators
        System.out.println("\n");
        Iterator<Integer> iter=l.iterator();
        while(iter.hasNext()) {
            Integer i=iter.next();
            System.out.println(i);
        }

        System.out.println("\n");
        ListIterator<Integer> iterr=l.listIterator(l.size());
        while(iterr.hasPrevious()) {
            Integer i=iterr.previous();
            System.out.println(i);
        }

    }
}
