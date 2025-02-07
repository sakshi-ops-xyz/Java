package java8Features.test;

interface Abc {
    int method(int a, int b);
}

public class LambdaFun {
    public static void main(String[] args) {
        Abc abc=(a, b) -> a+b;
        abc.method(2,5);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Abc abc=new Abc() {
//            @Override
//            public int method(int a, int b) {
//                return a+b;
//            }
//        };
//        System.out.println(abc.method(2,4));
//    }
//}

