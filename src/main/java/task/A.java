package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    public static List<Integer> l=new ArrayList<>();
    public static List<Integer> l2=List.of(1,2,3,4);
    static int x=10;
    static String s="Sakshi";
    static StringBuilder s2=new StringBuilder();
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        l.add(10);
        l.add(20);

        StringBuilder s3=new StringBuilder("Hello");
        s2=s3;

        System.out.println("From A : "+l);
        System.out.println("From A : "+l2);
        System.out.println("From A : "+x);
        System.out.println("From A : "+s);
        System.out.println("From A : "+s2);

//        B.main(null);
//        int x=sc.nextInt();
    }
}
