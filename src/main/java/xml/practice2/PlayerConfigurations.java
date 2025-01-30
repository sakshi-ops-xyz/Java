package xml.practice2;

import javax.xml.bind.annotation.*;

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
