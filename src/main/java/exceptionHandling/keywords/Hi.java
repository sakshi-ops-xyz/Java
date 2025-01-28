package exceptionHandling.keywords;

public class Hi {
    // throws
    public static void setAge(int x) throws IllegalArgumentException{
        if(x < 0) throw new IllegalArgumentException();
        System.out.println("hello");
    }
    public static void main(String[] args) {
        // try-catch
        try {
            int x[]={1,2};
            System.out.println(x[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }

        // try-finally (try-catch-finally) (try-finally (try-catch))
        try {
            int x[]={1,2};
        } catch (IndexOutOfBoundsException e) {
            System.out.println("WhATEVER");
        }finally {
            System.out.println("idk");
        }

        // throw
        try {
            throw new RuntimeException();         // to throw exception
        } catch (RuntimeException e) {
            System.out.println("xyz");
        }

        // throws
        try {
            setAge(-2);
        } catch (IllegalArgumentException e) {
         //   throw new RuntimeException(e);
        }

    }
}
