package collectionFramework.interfaces;

import java.util.ArrayList;
import java.util.List;

public class MyClass2 {

    public static void main(String[] args) {

        class Student {
            private int rollNumber;
            Student(int rollNumber) {
                this.rollNumber=rollNumber;
            }
            public int getRollNumber() {
                return this.rollNumber;
            }
        }

        Student s=new Student(10);
        List<Object> o=new ArrayList<Object>();
        o.add(s);
        o.add(10);
        o.add(new String("hello"));

        System.out.println(o);
    }
}
