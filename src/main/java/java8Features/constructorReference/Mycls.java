package java8Features.constructorReference;

import java.util.*;
import java.util.stream.Collectors;

class Student {

    private String name;


    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: "+this.name;
    }
}

public class Mycls {
    public static void main(String[] args) {
        List<String> l=Arrays.asList(new String[]{"Sam", "Jam"});

        // Without using constructor reference
//        List<Student> x=l.stream().map(i -> new Student(i)).collect(Collectors.toList());
        // With constructor reference
        List<Student> x=l.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(x);



    }
}
