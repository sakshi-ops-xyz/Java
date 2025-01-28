package superAndThisKeyword;

public class SuperClass {
    private int num;
    protected int num2=20;
    static int num3=20;

    public SuperClass() {
        // super();     // cannot use both this and super in same constructor
        this(10);    // use to access constructors within same class
        System.out.println("Default constructor of superclass");
    }

    public SuperClass(int x) {
        System.out.println("Parameterized constructor of superclass");
    }

    public void method(int num) {
        this.num=num;      // To access private variable of class associated with the object
    }

    public static void staticMethod() {
        System.out.println("Static method in subclass");
    }
}
