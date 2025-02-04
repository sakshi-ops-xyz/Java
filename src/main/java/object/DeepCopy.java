package object;

class Class2 implements Cloneable {
    private int val;

    public Class2() {}

    private Class2(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new Class2(this.val);  // Proper deep copy
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Class2 c1 = new Class2();
        c1.setVal(10);

        Class2 c2 = (Class2) c1.clone();
        System.out.println(c2.getVal());

        c1.setVal(20);
        System.out.println(c2.getVal());
    }
}
