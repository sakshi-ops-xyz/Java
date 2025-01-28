package comparatorVsComprable;

import java.util.*;

class StudentClass implements Comparable<StudentClass>{
    private int roll;
    private String name;

    StudentClass(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{roll=" + roll + ",  name='" + name + "'}";
    }

    @Override
    public int compareTo(StudentClass o) {
        return Integer.compare(this.getRoll(), o.getRoll());
    }

}

public class MyClass2 {
    public static void main(String[] args) {

        StudentClass s1=new StudentClass(1, "A");
        StudentClass s2=new StudentClass(2, "B");
        StudentClass s3=new StudentClass(3, "C");
        StudentClass s4=new StudentClass(4, "D");
        List<StudentClass> list=new ArrayList<>(Arrays.asList(s2, s1, s4, s3));

        Collections.sort(list);
        System.out.println(list);
    }
}
