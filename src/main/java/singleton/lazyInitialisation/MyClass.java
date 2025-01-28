package singleton.lazyInitialisation;

public class MyClass {
    private static MyClass myInstance=null;
    private MyClass() {
        System.out.println("MyClass instance created");
    }

    static public synchronized MyClass setMyInstance() {      // lazy initialisation is not thread safe but can make it by adding synchronized keyword
        if(myInstance==null) {
            myInstance=new MyClass();
        }
        return myInstance;
    }
}

class Main {
    public static void main(String[] args) {
        MyClass m=MyClass.setMyInstance();
    }
}
