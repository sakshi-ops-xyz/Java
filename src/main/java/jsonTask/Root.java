package jsonTask;

public class Root {
    private boolean status;
    private String message;
    private Data data;
    private String errorData;
    private String display_message;
    private int response_code;

    public Root() {
    }

    public String getErrorData() {
        return errorData;
    }

    public void setErrorData(String errorData) {
        this.errorData = errorData;
    }

    public String getMessage() {
        return message;
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

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
