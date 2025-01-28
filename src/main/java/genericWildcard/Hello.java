package genericWildcard;

import java.util.List;

public class Hello {
    void print(List<?> l, List<?> l2) {
        for(var i: l) {
//            l2.add(i);     can't add using wildcard
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4);
        List<Integer> l2=List.of(1,2,3,4);

        Hello h=new Hello();
        h.print(l, l2);
    }
}
