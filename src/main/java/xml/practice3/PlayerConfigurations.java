package xml.practice3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PlayerConfigurations {
    private PlayerConfig playerConfig;

    public PlayerConfigurations() {
    }

    public PlayerConfig getPlayerConfig() {
        return playerConfig;
    }

    @Override
    public String toString() {
        return "PlayerConfigurations{" +
                "playerConfig=" + playerConfig +
                '}';
    }
}
