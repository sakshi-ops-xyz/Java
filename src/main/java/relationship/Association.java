package relationship;

import java.util.List;
import java.util.ArrayList;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Student> getStudents() {
        return students;
    }
}


public class Association {
    public static void main(String[] args) {
        Student student1 = new Student("A");
        Student student2 = new Student("B");

        School school = new School("Abc");

        school.addStudent(student1);
        school.addStudent(student2);

        System.out.println(school.getSchoolName());
        for (Student student : school.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
