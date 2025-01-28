package genericMethod;

import genericBounded.GenericClass;

public class GenericMethod {

    public <T> GenericMethod(T val) {
        System.out.println(val);
    }

    @SafeVarargs
    public final <T> void print(T... val) {
        for(var i: val) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        GenericMethod g=new GenericMethod("hello");
        g.print(10, "hello", "By", 4,0);
    }
}
