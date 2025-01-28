package java8Features.lambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private int roll;
    private String name;

    Student(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }

    public int getRoll() {
        return this.roll;
    }

    @Override
    public String toString() {
        return "RollNo: "+this.roll+" | Name: "+this.name;
    }
}

public class MyClass3 {
    public static void main(String[] args) {
        Student s1=new Student(2, "A");
        Student s2=new Student(1, "B");
        Student s3=new Student(4, "C");
        Student s4=new Student(3, "D");

        List<Student> s=new ArrayList<>(Arrays.asList(new Student[]{s1, s2, s3, s4}));
        System.out.println(s);

        s.sort((o1, o2) -> Integer.compare(o1.getRoll(), o2.getRoll()));
        System.out.println("\nList after sorting acc to roll number");
        System.out.println(s);

    }
}
