package upcastingAndDowncasting;

public class AClass {
    String s;

    public void method() {
        System.out.println("A Class Method");
    }

    static void staticMethod() {
        System.out.println("Static method in A class");
    }

}

class BClass extends AClass{
    public void method() {
        System.out.println("B Class Overidden Method");
    }

    static void staticMethod() {
        System.out.println("Static method in B class");
    }
}

class Main {
    public static void main(String[] args) {
        // Upcasting: BClass object assigned to AClass reference
        AClass obj1 = (AClass)new BClass(); // Implicit upcasting (no need for explicit cast)
        obj1.method();  // Output: "B Class Overridden Method" (because of polymorphism)
        obj1.staticMethod();    // e.g. of method hiding

        // Downcasting: Correct way to downcast with type checking
        AClass obj2 = new BClass();  // This must be an instance of BClass
        BClass obj3 = (BClass) obj2;  // Now it's safe to downcast
        obj3.method();  // Output: "B Class Overridden Method"
        obj3.staticMethod();

    }
}