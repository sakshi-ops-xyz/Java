package constructors;

public class Constructors {
    // there are default and parameterized constructor in java
    // there can be public private and protected constructors
    private int num;

    Constructors() {
        this(20);
        this.num=0;
        System.out.println("Default Constructor");
    }

    Constructors(int num) {
        this.num=num;
        System.out.println("Parameterized Constructor");
    }

    Constructors(Constructors obj) {
        this.num=obj.num;
        System.out.println("Copy Constructor");
    }

    public int getNum() {
        return this.num;
    }
}

class Main {
    public static void main(String[] args) {
        Constructors c1=new Constructors();
//        Constructors c2=new Constructors(30);
//        Constructors c3=new Constructors(c2);
//
//        System.out.println(c1.getNum());
//        System.out.println(c2.getNum());
//        System.out.println(c3.getNum());
    }
}
