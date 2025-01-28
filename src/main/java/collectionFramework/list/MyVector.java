package collectionFramework.list;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Integer> a=new Vector<>();

        // Adding elements
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

        // 6. Getting elements
        for(int i=0; i<a.size(); i++) {
            System.out.println("Element at " + i + "th index" + ": " + a.get(i));
        }

        // 7. Checking if empty
        System.out.println(a.isEmpty());

        // 8. Clearing whole
        a.clear();

        System.out.println("\n");

        // Heterogeneous vector
        Vector vect=new Vector();
        vect.add(10);
        vect.add("helloo");

        for (int i = 0; i < vect.size(); i++) {
            System.out.println(vect.get(i));
        }

    }
}
