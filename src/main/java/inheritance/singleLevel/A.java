package inheritance.singleLevel;

public class A {
    public int x=10;

    public A() {
        System.out.println("A class constructor");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method of A");
    }

    public void method() {
        System.out.println("A class method");
    }

    public void method2() {
        System.out.println("A class method2");
    }

//
//    static void method2() {
//        System.out.println("A class static method");
//    }


}
