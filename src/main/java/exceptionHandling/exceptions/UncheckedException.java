package exceptionHandling.exceptions;

import inheritance.singleLevel.A;

public class UncheckedException {
    public static void setAge(int x) {
        if(x < 0) {
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
        // index out of bound
        try {
            int a[] ={1,2,3};
            System.out.println(a[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        // arithmetic
        try {
            int c=2/0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }

        // null pointer
        try{
            String x=null;
            System.out.println(x.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("Value is null");
        }

        // number format exception
        try{
            Integer x=Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            System.out.println("wrong format");
        }

        // illegal argument exception
        try{
            setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong argument");
        }
    }
}















