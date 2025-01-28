package collectionFramework.map;

import java.util.*;
import java.util.stream.Collectors;

class Studentt {

    private String name;
    private int roll;


    Studentt(Integer roll, String name) {
        this.name = name;
        this.roll=roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.roll+", "+this.name;
    }
}

public class Mycls2 {
    public static void main(String[] args) {
        Map<Integer, String> m=new HashMap<>() {{
            put(1, "Sam");
            put(2, "Jam");
            put(3, "Pam");
        }};

        List<Studentt> s=m.entrySet().stream().map(i -> new Studentt(i.getKey(), i.getValue())).collect(Collectors.toList());
        System.out.println(s);

    }
}
