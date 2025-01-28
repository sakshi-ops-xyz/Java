package java8Features.lambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Showing variable capturing using lambda expression

interface MyFun {
    void method();
}

public class MyClass2 {
    // instance variable   (can modify instance variable inside lambda function)
    static int z=10;
    public static void main(String[] args) {

        // Local variable
        int x=10;
        MyFun m=()-> {
            // x++; cannot modify local variable as it behave as final in lambda function
            int y=x+10;            // can definitely use it, but can't modify
            System.out.println(y);
            z=30;
            System.out.println(z);
        };

        m.method();
    }

}
