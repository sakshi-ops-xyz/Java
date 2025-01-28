package object;

public class ObjectClass {
    public static void main(String[] args) {
        // method in object class
        Integer x=1234;
        String s="hi";
        String s2="hi";

        // 1. .toString()
        System.out.println(x.toString());

        // 2. getClass()
        System.out.println(x.getClass());

        // 3. hashCode()
        System.out.println(x.hashCode());

        // 4. equals()
        System.out.println(s.equals(s2));

        // Other
        // 5. clone(), finalize(), notify(), notifyAll(), wait()



    }
}
