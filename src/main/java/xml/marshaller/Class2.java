package xml.marshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Map;

class Student2 {
    private String name;
    private int roll;

    // Default constructor is needed for JAXB to work
    public Student2() {}

    public Student2(String name, int roll) {
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

@XmlRootElement
class School {
    private List<Student2> list;
    private Map<Integer, Student2> map;

    public School() {
        Student2 s1=new Student2("Sakshi", 1);
        Student2 s2=new Student2("Aditya", 2);
        Student2 s3=new Student2("Anjani", 3);
        list=List.of(s1, s2, s3);
        map=Map.of(1, s1, 2, s2, 3, s3);
    }

    @XmlElement
    public List<Student2> getList() {
        return list;
    }

    @XmlElement
    public Map<Integer, Student2> getMap() {
        return map;
    }
}

public class Class2 {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(School.class);
        Marshaller marshaller=context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        School school=new School();

        marshaller.marshal(school, System.out);
    }
}
