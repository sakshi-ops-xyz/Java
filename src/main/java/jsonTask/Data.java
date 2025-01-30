package jsonTask;

public class Data {
    private String dvcResponse;
    private String ipadResponse;
    private FnbResponse fnbResponse;

    public Data() {
    }

    public FnbResponse getFnbResponse() {
        return fnbResponse;
    }

    public void setFnbResponse(FnbResponse fnbResponse) {
        this.fnbResponse = fnbResponse;
    }

    public String getIpadResponse() {
        return ipadResponse;
    }

    public void setIpadResponse(String ipadResponse) {
        this.ipadResponse = ipadResponse;
    }

    public String getDvcResponse() {
        return dvcResponse;
    }

    public void setDvcResponse(String dvcResponse) {
        this.dvcResponse = dvcResponse;
    }
}
