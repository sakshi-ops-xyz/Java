package xml.practice1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Digitalmedia {
    private int id;
    private int roomid;
    private String type;
    private Ndidetails ndidetails;

    public Digitalmedia() {
    }

    public Ndidetails getNdidetails() {
        return ndidetails;
    }

    public String getType() {
        return type;
    }

    public int getRoomid() {
        return roomid;
    }

    public int getId() {
        return id;
    }
}
