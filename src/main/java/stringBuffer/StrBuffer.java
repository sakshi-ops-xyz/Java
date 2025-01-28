package stringBuffer;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer strB=new StringBuffer("ood Morning");

        // Methods
        System.out.println(strB.insert(0, 'G'));
        System.out.println(strB.append(" Amigos"));
        System.out.println(strB.replace(12, 19, " Folks"));
        System.out.println(strB.substring(0, 4));
        System.out.println(strB.charAt(0));
        System.out.println(strB.indexOf("o"));
        System.out.println(strB.reverse());
        System.out.println(strB.length());
        System.out.println(strB.capacity());

        // StringBuffer to string
        // Can use toString or can pass in constructor while making object
        String str=strB.toString();
        System.out.println(str);
        String str2=new String(strB);
        System.out.println(str2);

        // String to StringBuffer (By passing in constructor while making reference variable
        StringBuilder s2=new StringBuilder(str);
        System.out.println(s2);
    }
}
