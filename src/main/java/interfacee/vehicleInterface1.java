package interfacee;

// functional and marker are types of interface in java
public interface vehicleInterface1 {
    // there are public, final and static variables
    public int num1=1;
    final int num2=2;
    static int num3=3;


    // In interface all the methods are explicitly abstract until and unless static or default
    // there are static, default, private and abstract methods in interfaces (only abstract before java 8, default and static in java 8 and after, private and private static methods in java 9)
    abstract void speed();

    // private methods are use in Sharing Code Between Default Methods, or writing an internal logic that can't expose to external world
    private void pvtMethod() {
        System.out.println("Private method of vehicle interface");
    }

    default void documentation() {
        System.out.println("Vehicle Interface1 Documentation");
    }

    // static methods helps us in providing security by not allowing implementation classes to override them
    static void common() {
        System.out.println("Common implementation");
    }
}


