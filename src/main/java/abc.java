
class A {
    A() {
        System.out.println("A class constrcutor");
    }

    public void method1() {
        System.out.println("A hello method1");
    }

    public void method2() {
        System.out.println("A xyz method2");
    }

    static void method4() {
        System.out.println("A class method4");
    }

    static void method5() {
        System.out.println("A class method5");
    }
}

class B extends A{
    B() {
        System.out.println("B class constructor");
    }

    public void method2() {
        System.out.println("B method2");
    }

    public void method3() {
        System.out.println("B method3");
    }

    static void method4() {
        System.out.println("B class method4");
    }

    static void method6() {
        System.out.println("B class method5");
    }
}


public class abc {
    public static void main(String[] args) {
        A a=new B();
//        a.A();

       // a.method4();
//        a.method2();
//        a.method4();
//        B b=new B();
//        b.method2();
    }

    public void main(int x) {

    }
}
