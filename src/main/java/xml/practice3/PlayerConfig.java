package xml.practice3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

//@XmlAccessorType(XmlAccessType.FIELD)
public class PlayerConfig {
    public PlayerConfig() {
    }

    @XmlElement
    private List<Player> player;

    @XmlAttribute
    private String displayDeviceId;
    @XmlAttribute
    private String dvcId;
    @XmlAttribute
    private String hotelId;
    @XmlAttribute(name = "roomNumber")
    private String sakshi;

    public List<Player> getPlayer() {
        return player;
    }

    public String getDvcId() {
        return dvcId;
    }

    public String getSakshi() {
        return sakshi;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getDisplayDeviceId() {
        return displayDeviceId;
    }

    @Override
    public String toString() {
        return "PlayerConfig{" +
                "player=" + player +
                ", displayDeviceId='" + displayDeviceId + '\'' +
                ", dvcId='" + dvcId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                ", roomNumber='" + sakshi + '\'' +
                '}';
    }
}
