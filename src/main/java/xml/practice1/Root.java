package xml.practice1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {
    private List<Digitalmedia> digitalmedia=new ArrayList<>();

//    @XmlElement(name = "digitalmedia")
    public List<Digitalmedia> getDigitalmedia() {
        return digitalmedia;
    }
}
