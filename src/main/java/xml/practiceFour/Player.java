package xml.practiceFour;

import javax.xml.bind.annotation.XmlElement;

public class Player {
    private String driverId;
    private String ip;

    @XmlElement(name = "driverId", required = true)  // Ensure correct mapping
    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    @XmlElement(name = "ip")  // Ensure correct mapping
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Player{" +
                "driverId='" + driverId + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
