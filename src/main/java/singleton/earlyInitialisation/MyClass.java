package singleton.earlyInitialisation;

public class MyClass {
    // early initialisation is thread safe as it is synchronized

    private MyClass() {
        System.out.println("MyClass instance created");
    }
    private static final MyClass myInstance=new MyClass();

    static MyClass getInstance() {
        return myInstance;
    }

}

class Main {
    public static void main(String[] args) {
        MyClass m=MyClass.getInstance();
        MyClass m2=MyClass.getInstance();
    }
}