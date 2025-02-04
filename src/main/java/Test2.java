import java.util.Scanner;

class CustomException extends Exception {
    public CustomException() {
        super("Custom exception.");
    }
}

public class Test2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws CustomException {
        Integer x;
        x=sc.nextInt();
        String str=x.toString();
        System.out.println(x);

//        System.out.println(str.contains("0"));

        if(str.contains("0") == true) {
            try {
                throw new CustomException();
            } finally {
                System.out.println("hello");
            }
        }

//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i)=='0') {
//
//            }
//        }
    }
}
