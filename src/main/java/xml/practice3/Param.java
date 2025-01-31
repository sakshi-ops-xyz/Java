package xml.practice3;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Param {

    private String param;

    public Param() {
    }

    public String getParam() {
        return param;
    }

    @Override
    public String toString() {
        return "Param{" +
                "param='" + param + '\'' +
                '}';
    }
}
