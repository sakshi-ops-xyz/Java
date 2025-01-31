package xml.practice3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class Connection {
    @XmlAttribute
    private String type;

    @XmlElement
    private String ip;
    @XmlElement
    private int port;
    @XmlElement
    private String url;

    public Connection() {
    }

    public String getType() {
        return type;
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "type='" + type + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                ", url='" + url + '\'' +
                '}';
    }
}
