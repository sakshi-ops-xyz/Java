package enums;

import java.util.Arrays;

public enum Days {
    MONDAY(12), TUESDAY(1), WEDNESDAY(2), FRIDAY(4), SATURDAY(9), SUNDAY(0);

    Days(int x) {
        System.out.println("Added");
    }
}

class A {
    public static void main(String[] args) {
        Days[] days = Days.values();
        System.out.println(Arrays.toString(days));

        Days d=Days.FRIDAY;
        Days d2=Days.FRIDAY;
        System.out.println(d.ordinal());
        if(d==d2) {
            System.out.println("yes");
        } else System.out.println("no");

        System.out.println(d.equals(d2));
    }
}
