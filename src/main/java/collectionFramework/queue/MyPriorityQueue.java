package collectionFramework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    private int rollNo;
    private String name;

    Student(int rollNo, String name) {
        this.rollNo=rollNo;
        this.name=name;
    }

    public void getInfo() {
        System.out.println("Roll no.: " + this.rollNo + ", Name: " + this.name);
    }

    public int getRollNumber() {
        return this.rollNo;
    }

}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // comparing students based on rollNumber
        return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    }
}

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());

        // Adding students to the PriorityQueue
        pq.offer(new Student(102, "A"));
        pq.offer(new Student(101, "B"));
        pq.offer(new Student(104, "C"));
        pq.offer(new Student(103, "D"));
        pq.offer(new Student(104, "E"));


        // pOlling students based on priority (roll no .)
        System.out.println("Students in order of priority (by roll number):");
        while (!pq.isEmpty()) {
            pq.poll().getInfo();
        }
    }
}
