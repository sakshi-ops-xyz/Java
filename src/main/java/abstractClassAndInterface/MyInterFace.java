package abstractClassAndInterface;

public interface MyInterFace {
    int num=10;

    default void defaultMethod() {
        System.out.println("Interface default method");
    }

    void interfaceAbstractMethod();

    static void staticMethod() {
        System.out.println("Static Method of interface");
    }
}

abstract class AbstractClass implements MyInterFace{
    abstract void abstractMethod();

    AbstractClass() {
        System.out.println("Private Constructor of abstract class");
    }

    AbstractClass(int num) {
        System.out.println("Parameterized Constructor of abstract class");
    }
}

class SubClass extends AbstractClass implements MyInterFace{
    SubClass() {
        System.out.println("Default Constructor of Subclass");
    }

    @Override
    public void interfaceAbstractMethod() {
        System.out.println("Defining interface's abstract method");
    }

    @Override
    public void abstractMethod() {
        System.out.println("Defining abstract method of abstract class");
    }
}

class Main {
    public static void main(String[] args) {
        AbstractClass a=new SubClass();
        MyInterFace m=new SubClass();

        a.abstractMethod();
        a.defaultMethod();
        a.interfaceAbstractMethod();
        m.interfaceAbstractMethod();
        m.defaultMethod();
    }
}
