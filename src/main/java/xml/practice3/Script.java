package xml.practice3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

//@XmlAccessorType(XmlAccessType.FIELD)
public class Script {
    @XmlAttribute
    private String type;
    @XmlElement
    private List<Param> params;

    public Script() {
    }

    public String getType() {
        return type;
    }

    public List<Param> getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "Script{" +
                "type='" + type + '\'' +
                ", params=" + params +
                '}';
    }
}
