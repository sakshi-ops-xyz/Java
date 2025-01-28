package java8Features.functionalInterfacee;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        // get method (only method (abstract))
        Supplier<Integer> s= () -> 100;
        System.out.println(s.get());
    }
}
