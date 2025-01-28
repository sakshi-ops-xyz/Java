package innerClass;


public class MyClass {
    // private class

    private class PrivateInnerClass {
        int x;
        public void setX(int x) {
            this.x=x;

        }
        public int getX() {
            return this.x;
        }
    }

    // protected class
    protected class ProtectedInnerClass {
        int y;
        public void setY(int y) {
            this.y=y;
        }
        public int getY() {
            return this.y;
        }
    }

    // static class   (can create its instances without use of outer class instance)
    static class StaticInnerClass{
        int z;
        public void setZ(int z) {
            this.z=z;
        }
        public int getZ() {
            return this.z;
        }
    }
    
    // public class  (accessible from anywhere in the package, but need outclass object to make its instances
    public class PublicInnerClass extends ProtectedInnerClass {
        int i;
        public void setI(int i) {
            this.i=i;
        }
        public int getI() {
            return this.i;
        }

        @Override
        public int getY() {
            return super.getY();
        }
    }

    // default inner class  (Only accessible inside packages)
    class DefaultInnerClass {
        public void method() {
            System.out.println("Hello");
        }
    }
}

// non-static inner class cannot be extended by other class  in package as they are tied to instances of outer-class, but can extend static inner class
class AnotherClass extends MyClass.StaticInnerClass{
    @Override
    public int getZ() {
        return this.z;
    }
}


class main {
    public static void main(String[] args) {
        // static classes can be accessed without making object of its outer class
        MyClass.StaticInnerClass a=new MyClass.StaticInnerClass();
        a.setZ(10);
        System.out.println(a.getZ());

        MyClass myClass=new MyClass();

        // accessing non-static classes
        MyClass.PublicInnerClass b=myClass.new PublicInnerClass();
        b.setI(20);
        System.out.println(b.getI());
        b.setY(40);         // using inherited methods of protected inner class
        System.out.println(b.getY());
        MyClass.ProtectedInnerClass c=myClass.new ProtectedInnerClass();
        c.setY(30);
        System.out.println(c.getY());

        //
        AnotherClass x=new AnotherClass();
        x.setZ(10);
        System.out.println(x.getZ());
    }
}
