package java8Features.lambdaFunction;

// Functional interface
interface MyInterface {
    void sayHello(String name);
}

interface MyInterface2 {
    int sum(int i, int j);
}

public class MyClass {
    public static void main(String[] args) {
        /*
        // Without lambda expressions
        MyInterface m=new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        m.sayHello();
         */

        // With lambda expression
        MyInterface m=name -> System.out.println("Hello " + name);
        m.sayHello("Sakshi");


        // method with return type or parameters
        MyInterface2 m2=(i, j) -> i+j;               // no need to use return if the method is of one line
        System.out.println(m2.sum(2,3));
    }
}
