package inheritance.multiLevel;

public class Laptop extends Computer{
    public Laptop() {
        System.out.println("Laptop class constructor");
    }

//    @Override
//    public void method() {
//        System.out.println("Laptop class method");
//    }

    @Override
    public void method2() {
        System.out.println("Laptop class method2");
    }
}
