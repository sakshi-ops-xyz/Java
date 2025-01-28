package stringBuilder;

public class SB {
    public static void main(String[] args) {
        // String Builder is alternative of String and is immutable
        // It is not thread safe but is better at optimization then String Buffer

        StringBuilder s=new StringBuilder("ood Morning");
        StringBuilder sb=new StringBuilder(10);      // can pass capacity
        sb.append("hello");

        // Methods
        System.out.println(s.insert(0, 'G'));
        System.out.println(s.append(" Amigos"));
        System.out.println(s.replace(12, 19, " Folks"));
        System.out.println(s.substring(0, 4));
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("o"));
        System.out.println(s.reverse());
        System.out.println(s.length());
        System.out.println(s.capacity());

        // StringBuilder to string
        // Can use toString or can pass in constructor while making object
        String str=s.toString();
        System.out.println(str);
        String str2=new String(s);
        System.out.println(str2);

        // String to StringBuilder (By passing in constructor while making reference variable
        StringBuilder s2=new StringBuilder(str);
        System.out.println(s2);

    }
}
