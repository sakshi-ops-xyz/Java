package abstractClass;

abstract public class AbstractClass {
    protected int price;

    // Constructor in abstract class is only called during subclass instantiation using super()
    AbstractClass() {
        price=0;
        System.out.println("Abstract Class constructor");
    }

    // Abstract classes can have public, abstract, final and static methods
    abstract void setPrice(int price);

    final public int getPrice() {
        return price;
    }

    public static void staticMethod() {
        System.out.println("Static method of abstract class");
    }


}
