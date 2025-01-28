package finalKeyword;

/*final*/ public class finalKeyword {
    // final keyword can be used with variable, method and class
    final int num;

    finalKeyword() {
        num=10;           // can use constructor to initialise final variable or can directly assign value to it
    }

    final void method() {
        // this.num=20;     // cannot chg the value of final variable
        System.out.println("Final method");
    }

    final void method(int x) {         // can overload final method (i.e. same signature but different parameter or return type)
        System.out.println("Overloaded Final method");
    }
}

class Main extends finalKeyword{
    public static void main(String[] args) {
        System.out.println("yup");
    }

    // void method() { ... }    // cannot override final method
}
