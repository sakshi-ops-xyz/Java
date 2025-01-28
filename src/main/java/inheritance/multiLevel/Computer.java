package inheritance.multiLevel;

public class Computer extends Device{

//    constructors are not members therefore cannot override them
//    public Device() { ... }

    public Computer() {
        System.out.println("Computer class constructor");
    }

    @Override
    public void method() {
        System.out.println("Computer class method");
    }

    public void method2() {
        System.out.println("Computer class method2");
    }
}
