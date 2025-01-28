package staticKeyword;

public class StaticKeyword {
    // there are static variables, methods, blocks and nested classes
    static int x=10;

    static void method() {
        System.out.println("Static method");
    }

    static class StaticNestedLClass {
        int y=30;
        static int z=20;

        void method2() {
            // method();         // inner class can call members of outer class
            System.out.println("Method2 of nested static class");
        }
    }

//    static void method3() {
//        method2();                // outer class cannot call members of inner class
//    }

    class innerClass {
        static int x=10;
        void method4() {
            System.out.println("Method 4 of nested non-static class");
        }
    }

    int y=innerClass.x;
}


class Main {
    public static void main(String[] args) {
        StaticKeyword s=new StaticKeyword();
        // s.x;       // static variables are not associated with object
        System.out.println(StaticKeyword.x);
        StaticKeyword.method();

        // Static nested Class don't need its enclosing class object to make its object
        StaticKeyword.StaticNestedLClass staticClassObj=new StaticKeyword.StaticNestedLClass();
        staticClassObj.method2();

        // Non-Static nested Class Object depends on the outer class
       StaticKeyword.innerClass i=s.new innerClass();
       i.method4();
       int y=StaticKeyword.innerClass.x;
        System.out.println(y);
        System.out.println(StaticKeyword.x);
    }
}