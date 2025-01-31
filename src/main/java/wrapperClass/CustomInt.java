package wrapperClass;

public class CustomInt<Integer> {
    private Integer val;
    public CustomInt(Integer val) {
        if(val == null) this.val=null;
        else if((int)val < 1 || (int)val > 9) {
            throw new IllegalArgumentException();
        }
        this.val=val;
    }
    public void println() {
        if(this.val==null) System.out.println("null");
        else System.out.println((int)this.val);
    }
}

class Main {
    public static void main(String[] args) {
        CustomInt i=new CustomInt(null);
        i.println();
        CustomInt i2=new CustomInt(8);
        i2.println();

        try {
            CustomInt i3=new CustomInt(10);
            i3.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}













