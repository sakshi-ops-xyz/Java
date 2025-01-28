package main;

import abstractClass.AbstractClass;
import abstractClass.Class1;
import conversions.Conversions;
import inheritance.hierarchical.*;
import inheritance.multiLevel.Computer;
import inheritance.multiLevel.Device;
import inheritance.multiLevel.Laptop;
import inheritance.singleLevel.A;
import inheritance.singleLevel.B;
import interfacee.BMW;
import interfacee.vehicleInterface1;
import superAndThisKeyword.SubClass;
import superAndThisKeyword.SuperClass;



public class Main {
    public static void main(String[] args) {
//        runSingletonExample();
//        runTypeConversionExample();
//        runByteAsciiHexConversionExample();
//        runSingleLevelInheritanceExample();
//        runMultilevelInheritanceExample();
//        equatingObjectExample();
//        runSuperAndThisKeywordExample();
//        runHierarchicalInheritance();
//        runInterfaceExample();
        runAbstractClassExample();
    }


    // Method for abstract class
    public static void runAbstractClassExample() {
        Class1 c=new Class1();
        System.out.println(c.getPrice());
        c.setPrice(10);
        System.out.println(c.getPrice());
        AbstractClass.staticMethod();
    }


    // Method for interface
    public static void runInterfaceExample() {
        BMW bmw=new BMW();
        bmw.documentation();
        System.out.println(vehicleInterface1.num3);
        vehicleInterface1.common();
    }

    // Method for super and this keyword
    public static void runSuperAndThisKeywordExample() {
        SubClass s=new SubClass(10);
        System.out.println("\n");
        SuperClass s2=new SuperClass(10);
        s.method2();
    }


    // Method for Hierarchical Inheritance
    public static void runHierarchicalInheritance() {
        Animal a=new Animal();
        Cat c=new Cat();
        Dog d=new Dog();
        GermanShephard gs=new GermanShephard();
        GoldenRetriever gr=new GoldenRetriever();

        a.sound();
        c.sound();
        c.name();
        d.sound();
        d.name();
        gs.sound();
        gs.name();
    }

    // Method for Single Inheritance
    public static void runSingleLevelInheritanceExample() {
        A a=new A();
        B b=new B();
        A c=new B();
        a.method();
        b.method();
        c.method();                  // Method call will depend on actual object (if both have same methods)
        c.method2();                 // If subclass don't have method, method of super class will get executed
        // a.protectMethod();        // can't call protected method out of class
        b.protectedMethod();
        System.out.println(b.x);     // 20
        System.out.println(a.x);     // 10
        System.out.println(c.x);     // 10  (Variable call will depend on reference variable unlike method)
    }


    // Method for concept equating object
    public static void equatingObjectExample() {
        A a=new A();
        B b=new B();

        // b=a;         // Cannot assign super class reference variable to subclass
        a=b;
        a.method();     // Will call B class method()
    }

    // Method for Multilevel Inheritance
    public static void runMultilevelInheritanceExample() {
        Device d=new Device();
        Computer c=new Computer();
        Laptop l=new Laptop();
        Device d2=new Computer();
        Device d3=new Laptop();
        Computer c2=new Laptop();

        d.method();
        c.method();
        c.method2();
        l.method();
        l.method2();
        d2.method();
        // d2.method2();   // Error
        d3.method();
        // d3.method2();   // Error
        c2.method();
        c2.method2();
    }
}
