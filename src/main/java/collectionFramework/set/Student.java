package collectionFramework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Student {
    private String name;
    private int rollNumber;

    Student(int rollNumber, String name) {
        this.name=name;
        this.rollNumber=rollNumber;
    }

    // For custom uniqueness, have to override below methods
    @Override
    public String toString() {
        return "Roll no: " + this.rollNumber + ", Name: " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1=new Student(1, "A");
        Student s2=new Student(2, "B");
        Student s3=new Student(3, "C");
        Student s4=new Student(2, "D");

        LinkedHashSet<Student> x=new LinkedHashSet<>();
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);

        System.out.println(x);
    }
}
