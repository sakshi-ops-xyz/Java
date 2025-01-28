package datatypes;

import javax.xml.crypto.Data;

public class Datatypes {
    public long l;        // 64 bits
    public int i;          // 32 bits
    public short s;        // 16 bits
    public byte b;         // 8 bits
    public double d;     // 64 bits
    public float f;     // 32 bits
    public char c;       // 16 bits
    public boolean bl;

    public void printDefault() {
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(bl);
    }

    // Wrapper classes are immutable

    public void autoBoxing() {
        // Primitive to Wrapper Class
        int x=10;
        Integer y=x;
        System.out.println(y);
    }

    public void autoUnboxing() {
        // Wrapper Class to Primitive
        Integer x=10;
        int y=x;
        System.out.println(y);
    }
}

class Main {
    public static void main(String[] args) {
//        Integer i2= null;
//        System.out.println(i2.intValue());        // not possible as object assigned as null
        Datatypes d=new Datatypes();
        d.printDefault();
        d.autoBoxing();
        d.autoUnboxing();

        // Wrapper classes methods
        Integer i=10;
        String str="101";
        System.out.println(Integer.valueOf(i));
        System.out.println(Integer.parseInt(str));
    }
}
