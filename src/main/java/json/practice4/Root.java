package json.practice4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Root {
    private boolean status;
    private String message;
    @JsonProperty("errorData")
    private String sakshi;
    private String display_message;
    private int response_code;
    private Data data;

    public Data getData() {
        return data;
    }

    public Root() {
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public String getDisplay_message() {
        return display_message;
    }

    public void setDisplay_message(String display_message) {
        this.display_message = display_message;
    }

//    public String getErrorData() {
//        return errorData;
//    }
//
//    public void setErrorData(String errorData) {
//        this.errorData = errorData;
//    }

    public String getSakshi() {
        return sakshi;
    }

    public void setSakshi(String sakshi) {
        this.sakshi = sakshi;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Root{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", sakshi='" + sakshi + '\'' +
                ", display_message='" + display_message + '\'' +
                ", response_code=" + response_code +
                ", data=" + data +
                '}';
    }
}
