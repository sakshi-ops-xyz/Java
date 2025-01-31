package json.practice2;

import java.util.List;

public class ServerDetails {
    private List<ServerConfigurations> serverConfigurations;
    private ServerConnectionDetails serverConnectionDetails;

    public ServerDetails() {}

    public List<ServerConfigurations> getServerConfigurations() {
        return serverConfigurations;
    }

    public void setServerConfigurations(List<ServerConfigurations> serverConfigurations) {
        this.serverConfigurations = serverConfigurations;
    }

    public ServerConnectionDetails getServerConnectionDetails() {
        return serverConnectionDetails;
    }

    public void setServerConnectionDetails(ServerConnectionDetails serverConnectionDetails) {
        this.serverConnectionDetails = serverConnectionDetails;
    }
}
