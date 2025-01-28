package methodHiding;

public class Test {
    static public void method() {
        System.out.println("Method1");
    }
    static int x=10;
}

class Test2 extends Test{
    static public void method() {
        System.out.println("Method");
    }
    static int x=20;
}

class Main {
    public static void main(String[] args) {
        Test t=new Test2();
        t.method();
    }
}

