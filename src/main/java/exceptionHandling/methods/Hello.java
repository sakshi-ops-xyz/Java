package exceptionHandling.methods;

public class Hello {
    public static void main(String[] args) {
        try {
            int x=2/0;
        } catch(ArithmeticException e) {
            System.out.println(e.getCause());
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
