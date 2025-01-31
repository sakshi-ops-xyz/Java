package json.practice2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerConfigurations {
    private RmsConfig rmsConfig;
    private String location;
    @JsonProperty("isButlerFeatureWithoutDvc")
    private String isButlerFeatureWithoutDvc;

    public ServerConfigurations() {}

    public RmsConfig getRmsConfig() {
        return rmsConfig;
    }

    public void setRmsConfig(RmsConfig rmsConfig) {
        this.rmsConfig = rmsConfig;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String isButlerFeatureWithoutDvc() {
        return isButlerFeatureWithoutDvc;
    }

    public void setButlerFeatureWithoutDvc(String isButlerFeatureWithoutDvc) {
        this.isButlerFeatureWithoutDvc = isButlerFeatureWithoutDvc;
    }
}
