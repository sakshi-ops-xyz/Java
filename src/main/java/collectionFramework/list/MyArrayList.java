package collectionFramework.list;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        // Below are all the constructors present in array list
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>(10);
        b.add(1);
        b.add(2);
        ArrayList<Integer> c=new ArrayList<>(b);   // will copy the value of b in c array list
        System.out.println(c);

        // 1. Adding in array list
        a.add(10);
        a.add(20);

        // 2. Inserting in array list
        a.add(0,0);

        // 3. Can add null in array list
        a.add(null);

        // 4. Replacing element to other element
        a.set(3, 30);

        // 5. Removing element
        a.remove(0);

        // 6. Getting elements// addAll Method for concatenating one list in another
        for(int i=0; i<a.size(); i++) {
            System.out.println("Element at " + i + "th index" + ": " + a.get(i));
        }

        // 7. Checking if empty
        System.out.println(a.isEmpty());

        // 8. Clearing whole list
        c.clear();

        // 9. Add all method to concat one list in another
        a.addAll(b);
        System.out.println(a);

        // 10. Remove all method remove all object belong to another collection
        a.removeAll(b);
        System.out.println(a);
        a.addAll(b);

        // 11. Only keep object of another collections and remove all
        a.retainAll(b);
        System.out.println(a);

        System.out.println("\n");

        // 9. Heterogeneous array list
        java.util.ArrayList arr=new java.util.ArrayList();
        arr.add(10);
        arr.add("Hi");
        System.out.println(arr);
    }
}








