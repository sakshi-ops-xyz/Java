package xml.practice1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Param {
    private String name;
    private int value;

    public Param() {
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
