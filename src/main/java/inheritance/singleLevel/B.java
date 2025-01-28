package inheritance.singleLevel;

public class B extends A{
    public int x=20;
    public B() {
        System.out.println("B class constructor");
    }

    public void method() {
        System.out.println("B class method");
    }


//    The access modifier of the overridden method cannot be more restrictive than the method in the superclass.
//    (means if it is protected in super class then cannot reduce the visibility to private
//    private void method() { ... }


//   However, you can make the method less restrictive
     public void protectedMethod() {
        A a=new A();
        // a.protectedMethod();
        System.out.println("Overriding protected method of A and increasing the visibility");
    }


//    cannot override static method (as static method belong to class not instance)
//    public void method2() { ... }
}
