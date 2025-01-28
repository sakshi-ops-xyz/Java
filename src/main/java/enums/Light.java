package enums;
import java.util.*;

public enum Light {
    DIM( "Dim Light"),
    BRIGHT( "Bright Light"),
    WARM("Warm Light"),
    COOL("Cool Light");

    private final String description;
    private static final Map<String, Light> m=new HashMap<>();
    private static final ArrayList<String> list=new ArrayList<>();


    Light(String description) {
        this.description=description;
    }

    static Light getConstantFromValue(String str) {
        return m.getOrDefault(str, null);
    }

    static ArrayList<String> getEnumsInString() {
        return list;
    }

    static String[] getDescriptionArray() {
        return m.keySet().toArray(new String[0]);
    }

    static {
        for(Light l: Light.values()) {
            m.put(l.description, l);
            list.add(l.name());
        }
    }
}


class Main {
    public static void main(String[] args) {
        System.out.println(Light.getConstantFromValue("Cool Light"));
        System.out.println(Light.getConstantFromValue("Dim Light"));
        System.out.println(Arrays.toString(Light.getDescriptionArray()));
//        ArrayList<String> a=Light.
    }
}


//}