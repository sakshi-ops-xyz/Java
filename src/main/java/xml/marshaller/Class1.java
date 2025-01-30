package xml.marshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.List;

@XmlRootElement // Indicates this class can be marshalled/unmarshalled to/from XML
class Student {
    private String name;
    private int roll;

    // Default constructor is needed for JAXB to work
    public Student() {}

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @XmlElement // Annotates fields to be included in the XML
    public String getName() {
        return this.name;
    }

    @XmlAttribute
    public int getRoll() {
        return this.roll;
    }
}

public class Class1 {
    public static void main(String[] args) throws JAXBException {
        Student s1=new Student("Sakshi", 1);
        Student s2=new Student("Aditya", 2);
        Student s3=new Student("Anjani", 3);
        List<Student> list=List.of(s1, s2, s3);

        // Creating JaxB Context
        JAXBContext context=JAXBContext.newInstance(Student.class);
        Marshaller marshaller=context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // 1. In output stream
        marshaller.marshal(s1, System.out);

        // 2. In file
        marshaller.marshal(s1, new File("test.xml"));
    }
}
