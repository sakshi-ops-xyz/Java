package conversions;

enum Fruits {
    APPLE("red"), ORANGE("red"), GRAPES("green");

    private String color;

    Fruits(String color) {
        this.color=color;
    }
}

class Animal {
    public void method() {
        System.out.println("Animal");
    }
    public void method1() {
        System.out.println("Animall");
    }
}

class Dog extends Animal {
    public void method() {
        System.out.println("Dog");
    }
    public void method3() {
        System.out.println("Dogg");
    }
}

public class TypeConversions {
    public static void main(String[] args) {

        // Wrapper to wrapper
        Integer int1=100;
        Double double1=int1.doubleValue();
        Byte byte1=int1.byteValue();
        System.out.println(double1+"\n"+byte1);

        // Primitive to wrapper   (autoboxing)
        int i=10;
        Integer j=i;
        System.out.println(j);

        // Wrapper to primitive   (unboxing)
        Integer x=10;
        int y=x;
        System.out.println(y);

        // Implicit casting  (converting to larger values)
        int a=10;
        double b=a;
        System.out.println(b);

        // Explicit casting    (converting to lower values)
        int c=100;
        byte d=(byte)c;
        char e=(char)c;
        System.out.println(d);
        System.out.println(e);

        // Object to String
        Integer g=10;
        int h=20;
        String str1=g.toString();
        String str2= String.valueOf(g);

        // String to Object
        String str5="1254";
        int x2=Integer.valueOf(str5);
        Integer x3=Integer.parseInt(str5);
        System.out.println(x3);
        System.out.println(x2);
        double d2=Double.valueOf("12.0");
        System.out.println(d2);

        // Upcasting and Downcasting


        Animal animal = new Dog(); // Upcasting
        Dog dog = (Dog) animal;    // Downcasting
        dog.method();
        dog.method3();
        dog.method1();
        Animal a2=new Animal();
//        Dog d4= (Dog) a2;


        // Enum conversion
        Fruits f=Fruits.APPLE;

        String myStr=f.name();      // enum to string
        String myStr2="GRAPES";
        Fruits f2=Fruits.valueOf(myStr);     // string to enum obj

        int i2=f.ordinal();
        f2=Fruits.values()[2];        // ordinal to string
        System.out.println(f2);

        System.out.println(String.format("%s was born on %dth of Jan", "Sam", 10));

    }
}


















