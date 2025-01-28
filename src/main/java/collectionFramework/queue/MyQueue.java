package collectionFramework.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        // Implementing Linked List as queue
        Deque<Integer> d=new LinkedList<>();
        d.add(10);
        d.add(20);
        d.offer(30);
        d.offer(40);
        d.push(50);
        System.out.println("Size: " + d.size());
//        System.out.println(d.peek());
        System.out.println(d.poll());   // return and remove first element

        while(!d.isEmpty()) {
            System.out.println("Removed element: " + d.remove());
        }

        // Implementing Array Deque
        Deque<Integer> d2=new ArrayDeque<>();
        d2.add(10);
        d2.add(20);
        d2.offer(30);
        d2.offer(40);
        d2.push(50);
        System.out.println("Size: " + d2.size());
//        System.out.println(d2.peek());
        System.out.println(d2.poll());   // return and remove first element

        while(!d2.isEmpty()) {
            System.out.println("Removed element: " + d2.remove());
        }
        
    }
}
