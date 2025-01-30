package json.practice2;

public class RmsConfig {
    private String relayAddress;
    private String buttonId;
    private String buttonName;
    private String serviceMenuItemId;
    private String address;

    public RmsConfig() {}

    public String getRelayAddress() {
        return relayAddress;
    }

    public void setRelayAddress(String relayAddress) {
        this.relayAddress = relayAddress;
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getServiceMenuItemId() {
        return serviceMenuItemId;
    }

    public void setServiceMenuItemId(String serviceMenuItemId) {
        this.serviceMenuItemId = serviceMenuItemId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
