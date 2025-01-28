package enumEg;
import java.util.Arrays;

public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30);
    private int days;

    Month(int days) {
        this.days=days;
    }


    static public void method() {
        System.out.println("Method function called");
    }
}

class Main {
    public static void main(String[] args) {
        Month m[]=Month.values();
        System.out.println(Arrays.toString(m));


        Month y= Month.FEBRUARY;
        String s=y.name();    // gettingn name of enumerator as string
        System.out.println(s);

        // Getting object by passing its string type
        String s2="FEBRUARY";
        Month x=Month.valueOf(s2);    // converting string to enumerator
        System.out.println(x);

        // if, want to get index of any constant
        System.out.println(x.ordinal());


        // Comparing two classes
        System.out.println(s.compareTo(s2));   // 0 if same -ve if value is before, +ve if value appear after

        Month.method();

    }
}
