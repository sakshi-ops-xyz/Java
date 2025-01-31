package xml.practice3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

//@XmlAccessorType(XmlAccessType.FIELD)
public class Player {
    public Player() {
    }

    @XmlAttribute
    private String type;

    @XmlElement
    private String driverId;
    @XmlElement
    private Connection connection;
    @XmlElement
    private List<Script> scripts;
    @XmlElement
    private String vodSecurityServerIp;
    @XmlElement
    private int vodSecurityServerPort;
    @XmlElement
    private int vodPollingTime;
    @XmlElement
    private boolean isEnableVodSecurity;
    @XmlElement
    private String movieServerUrl;
    @XmlElement

    private String sharedMediaServerURL;
    @XmlElement
    private String playlistFile;
    @XmlElement
    private String channelPropertyFile;
    @XmlElement
    private String channelListFetchUrl;
    @XmlElement
    private String channelListFile;
    @XmlElement
    private boolean isEnabledChannelAudioStreamFromScript;
    @XmlElement
    private String radioType;
    @XmlElement
    private String radioServerURL;
    @XmlElement
    private String defaultSSID;
    @XmlElement
    private String digicastSSID;
    @XmlElement
    private boolean isNeedToGeneratePswd;
    @XmlElement
    private String defaultPswd;
    @XmlElement
    private String guestContentStreamPropertyFile;
    @XmlElement
    private boolean isCursorEnabledAtLaunch;
    @XmlElement
    private boolean isCursorEnabledAtSignIn;


    public Connection getConnection() {
        return connection;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getType() {
        return type;
    }

    public List<Script> getScripts() {
        return scripts;
    }

    public String getVodSecurityServerIp() {
        return vodSecurityServerIp;
    }

    public int getVodSecurityServerPort() {
        return vodSecurityServerPort;
    }

    public int getVodPollingTime() {
        return vodPollingTime;
    }

    public boolean isEnableVodSecurity() {
        return isEnableVodSecurity;
    }

    public String getMovieServerUrl() {
        return movieServerUrl;
    }

    public String getPlaylistFile() {
        return playlistFile;
    }

    public String getChannelListFetchUrl() {
        return channelListFetchUrl;
    }

    public boolean isNeedToGeneratePswd() {
        return isNeedToGeneratePswd;
    }

    public String getDefaultSSID() {
        return defaultSSID;
    }

    public String getDigicastSSID() {
        return digicastSSID;
    }

    public String getRadioServerURL() {
        return radioServerURL;
    }

    public String getRadioType() {
        return radioType;
    }

    public boolean isEnabledChannelAudioStreamFromScript() {
        return isEnabledChannelAudioStreamFromScript;
    }

    public String getChannelListFile() {
        return channelListFile;
    }

    public String getChannelPropertyFile() {
        return channelPropertyFile;
    }

    public String getSharedMediaServerURL() {
        return sharedMediaServerURL;
    }

    public boolean isCursorEnabledAtSignIn() {
        return isCursorEnabledAtSignIn;
    }

    public boolean isCursorEnabledAtLaunch() {
        return isCursorEnabledAtLaunch;
    }

    public String getGuestContentStreamPropertyFile() {
        return guestContentStreamPropertyFile;
    }

    public String getDefaultPswd() {
        return defaultPswd;
    }

    @Override
    public String toString() {
        return "Player{" +
                "type='" + type + '\'' +
                ", driverId='" + driverId + '\'' +
                ", connection=" + connection +
                ", scripts=" + scripts +
                ", vodSecurityServerIp='" + vodSecurityServerIp + '\'' +
                ", vodSecurityServerPort=" + vodSecurityServerPort +
                ", vodPollingTime=" + vodPollingTime +
                ", isEnableVodSecurity=" + isEnableVodSecurity +
                ", movieServerUrl='" + movieServerUrl + '\'' +
                ", sharedMediaServerURL='" + sharedMediaServerURL + '\'' +
                ", playlistFile='" + playlistFile + '\'' +
                ", channelPropertyFile='" + channelPropertyFile + '\'' +
                ", channelListFetchUrl='" + channelListFetchUrl + '\'' +
                ", channelListFile='" + channelListFile + '\'' +
                ", isEnabledChannelAudioStreamFromScript=" + isEnabledChannelAudioStreamFromScript +
                ", radioType='" + radioType + '\'' +
                ", radioServerURL='" + radioServerURL + '\'' +
                ", defaultSSID='" + defaultSSID + '\'' +
                ", digicastSSID='" + digicastSSID + '\'' +
                ", isNeedToGeneratePswd=" + isNeedToGeneratePswd +
                ", defaultPswd='" + defaultPswd + '\'' +
                ", guestContentStreamPropertyFile='" + guestContentStreamPropertyFile + '\'' +
                ", isCursorEnabledAtLaunch=" + isCursorEnabledAtLaunch +
                ", isCursorEnabledAtSignIn=" + isCursorEnabledAtSignIn +
                '}';
    }
}
