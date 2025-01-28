package exceptionHandling.customException;

class CustomExpection extends Exception {
    public CustomExpection(String str) {
        super(str);
    }
}

public class Helo {
    public static void main(String[] args) {
        try {
            throw new CustomExpection("My Exception");
        } catch (CustomExpection c) {
            System.out.println("fdfdf");
        }
    }
}
