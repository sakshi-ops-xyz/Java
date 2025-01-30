package json.practice2;

import java.util.List;

public class ServerConfig {
    private String vendor;
    private List<ServerDetails> serverDetails;

    public ServerConfig() {}

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public List<ServerDetails> getServerDetails() {
        return serverDetails;
    }

    public void setServerDetails(List<ServerDetails> serverDetails) {
        this.serverDetails = serverDetails;
    }
}
