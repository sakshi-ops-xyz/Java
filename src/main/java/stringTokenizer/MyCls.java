package stringTokenizer;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MyCls {
    public static void main(String[] args) {
        String str="Hello, world!";
        StringTokenizer s=new StringTokenizer(str, ", ");
        System.out.println(s.countTokens());

        while(s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }

        String s2="Hello, world!";
        String[] split = s2.split(",");
        System.out.println(Arrays.toString(split));

    }
}
