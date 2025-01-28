package java8Features.functionalInterfacee;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<String> startWithA= a -> a.toLowerCase().charAt(0)=='a';
//        System.out.println(startWithA.test("Alana"));   // test() is abstract method

        Predicate<String> endWithN= a -> a.toLowerCase().charAt(a.length()-1)=='n';

        // and method  (both the predicate should true for true) (default method)
        Predicate<String> and=startWithA.and(endWithN);
        System.out.println(and.test("Alan"));

        // or method (any one should be true and both can be true)   (default method)
        Predicate<String> or=startWithA.or(endWithN);
        System.out.println(or.test("la"));

        // negate method (give negate answers of actual results)     (default method)
        System.out.println(startWithA.negate().test("Alan"));

        // isEqual() method (static method)
        Predicate<String> isEqualPredicate=Predicate.isEqual("Hello");
        System.out.println(isEqualPredicate.test("HellO"));
    }
}
