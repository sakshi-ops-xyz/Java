package comparatorVsComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

class Student {
    private int roll;
    private String name;

    Student(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{roll=" + roll + ", name='" + name + "'}";
    }
}

public class MyClass {
    public static void main(String[] args) {

        Comparator<Student> myComp=new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getRoll(), s2.getRoll());
            }
        };


        Student s1=new Student(1, "A");
        Student s2=new Student(2, "B");
        Student s3=new Student(3, "C");
        Student s4=new Student(4, "D");
        List<Student> list=new ArrayList<>(Arrays.asList(s2, s4, s3, s1));

        Collections.sort(list, myComp);
        System.out.println(list);
    }
}
