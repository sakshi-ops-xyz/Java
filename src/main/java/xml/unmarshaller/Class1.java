package xml.unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class School {
    private List<Student> students = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();

    @XmlElementWrapper(name="students")
    @XmlElement(name="student")
    public List<Student> getStudents() {
        return students;
    }

    @XmlElementWrapper(name="categories")
    @XmlElement(name="category")
    public List<Category> getCategories() {
        return categories;
    }
}

@XmlAccessorType(XmlAccessType.FIELD)
class Student {
    private String name;
    private int roll;

    public Student() {} // Required for JAXB

    public String getName() { return name; }
    public int getRoll() { return roll; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', roll=" + roll + "}";
    }
}

@XmlAccessorType(XmlAccessType.FIELD)
class Category {
    private String key;
    private List<String> value = new ArrayList<>();

    public Category() {} // Required for JAXB

    public String getKey() { return key; }
    public List<String> getValue() { return value; }

    @Override
    public String toString() {
        return "Category{key='" + key + "', value=" + value + "}";
    }
}

public class Class1 {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(School.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        School school = (School) unmarshaller.unmarshal(new File("test2.xml"));

        // Print Students
        System.out.println("Students List:");
        for (Student s : school.getStudents()) {
            System.out.println("  - Name: " + s.getName() + ", Roll: " + s.getRoll());
        }

        // Print Categories
        System.out.println("\nCategories:");
        for (Category c : school.getCategories()) {
            System.out.println("  - Key: " + c.getKey() + ", Values: " + c.getValue());
        }
    }
}

