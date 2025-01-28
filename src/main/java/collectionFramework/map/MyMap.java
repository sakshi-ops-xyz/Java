package collectionFramework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;


public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String> m=new HashMap<>();
        m.put(1, "B");
        m.put(2, "B");
        m.put(3, "C");
        m.put(4, "D");
        m.put(5, "E");
        m.put(6, "F");
        m.putIfAbsent(6,"J");  // will not add as already 6 is paired with F
        System.out.println(m.get(1));


        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m);
        System.out.println(m.containsKey(3));
        System.out.println(m.containsValue("H"));
        System.out.println(m.size());

        Iterator<Integer> iter=m.keySet().iterator();
        while(iter.hasNext()) {
            Integer i=iter.next();
            System.out.println("Key: "+i+" Value: "+m.get(i));
        }

        Set<Map.Entry<Integer, String>> s=m.entrySet();
        System.out.println(s);

        for(var i: s) {
            System.out.println(i.getKey() + ", " + i.getValue());
        }

    }
}
