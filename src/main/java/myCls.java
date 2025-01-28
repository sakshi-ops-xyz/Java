import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class myCls {
    public static void main(String[] args) {
        String s="sakshi sharma";

        Map<Character, Integer> m=new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(m.containsKey(c)==true) {
                int newV=m.get(c);
                m.put(c, newV+1);
            }
            else m.put(c, 1);
        }

        System.out.println(m);

        Iterator<Character> iter=m.keySet().iterator();

        while(iter.hasNext()) {
            char tem=iter.next();
            System.out.println(tem + " " + m.get(tem));
        }


    }
}
