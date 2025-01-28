package enumEg;

import collections.MYClass;

//making enum inside a class
public class MyClass2 {
    enum MyEnum {
        RED, GREEN, BLUE;
    }
}

class main {
    public static void main(String[] args) {
        // accessing enum inside a class
        MyClass2.MyEnum m= MyClass2.MyEnum.BLUE;
        System.out.println(m);
    }
}
