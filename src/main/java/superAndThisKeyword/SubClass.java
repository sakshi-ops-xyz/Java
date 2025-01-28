package superAndThisKeyword;

public class SubClass extends SuperClass {
    // this keyword is a reference to current object
    // the super keyword is used to refer to the parent class (or superclass) from a subclass

    public SubClass() {
        // super();     // automatically added by the compiler if not explicitly used  (call constructor of super class)
        // super(10);   // will call super class parameterized constructor
        System.out.println("Default constructor of Sub class");
    }

    public SubClass(int x) {
        System.out.println("Parameterised constructor of Sub class");
    }

    public void method2() {
        super.method(10);     // can call method of super class using super
        super.staticMethod();
        int n = super.num3;        // can access both static method and variable using super
        System.out.println(super.num2);

    }
}
