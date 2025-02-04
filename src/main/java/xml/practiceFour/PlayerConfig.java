package xml.practiceFour;

import javax.xml.bind.annotation.XmlElement;

public class PlayerConfig {
    private Player player;

    @XmlElement(name = "player")  // Ensure correct mapping
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "PlayerConfig{" +
                "player=" + player +
                '}';
    }
}
