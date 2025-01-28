package polymorphism;

public class MethodOverriding {
    public void method() {
        System.out.println("Method");
    }
}

class B extends MethodOverriding {
    public void method() {
        System.out.println("Overriden Method");
    }
}

class Main2 {
    public static void main(String[] args) {
        MethodOverriding m=new MethodOverriding();
        m.method();

        B b=new B();
        b.method();
    }
}
