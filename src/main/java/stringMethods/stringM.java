package stringMethods;

public class stringM {
    public static void main(String[] args) {
        String s=new String("A");
        String s2="A";
        String s3="A";

        System.out.println(s.hashCode());
//        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));

        s3=s3.concat("B").intern();
        String s4="AB";
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(s3);
        System.out.println(s4);


        String str4="Helo";
        String str5="World";
        System.out.println(String.join(",", str4, str5));
    }
}
