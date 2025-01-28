package collectionFramework;


import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEg {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> i=new CopyOnWriteArrayList<>();

        i.add(10);
        i.add(20);
        i.add(30);

        int y=40;
        for(var x:i) {
            System.out.println(x);
            i.add(y);
            y+=10;
            System.out.println(i);
        }

    }
}
