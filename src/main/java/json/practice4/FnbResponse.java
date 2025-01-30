package json.practice4;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FnbResponse {
    private Fnb fnb;
    private Fnb services;

    public FnbResponse() {
    }

    public Fnb getServices() {
        return services;
    }

    public void setServices(Fnb services) {
        this.services = services;
    }

    public Fnb getFnb() {
        return fnb;
    }

    public void setFnb(Fnb fnb) {
        this.fnb = fnb;
    }

    @Override
    public String toString() {
        return "FnbResponse{" +
                "fnb=" + fnb +
                ", services=" + services +
                '}';
    }
}
