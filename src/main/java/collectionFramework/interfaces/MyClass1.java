package collectionFramework.interfaces;

import java.util.Collection;
import java.util.Iterator;

// Trying to make object of collection Interface
public class MyClass1 {
    public static void main(String[] args) {

        // If try to make reference variable of Collection which is an interface it will create an anonymous class and the reference variable will point to the object of anonymous class
        Collection<Integer> c=new Collection<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        c.add(10);
        c.add(20);
        // Now since methods inside the anonymous class don't have any type of proper implementation of methods like add get etc its of no use
        // Programmer can explicitly like the logic as he/she want to have
        System.out.println(c.size());
    }
}

