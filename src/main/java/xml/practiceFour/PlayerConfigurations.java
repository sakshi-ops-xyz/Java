package xml.practiceFour;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "playerConfigurations")
public class PlayerConfigurations {
    private PlayerConfig playerConfig;

    @XmlElement(name = "playerConfig")
    public PlayerConfig getPlayerConfig() {
        return playerConfig;
    }

    public void setPlayerConfig(PlayerConfig playerConfig) {
        this.playerConfig = playerConfig;
    }

    @Override
    public String toString() {
        return "PlayerConfigurations{" +
                "playerConfig=" + playerConfig +
                '}';
    }
}
