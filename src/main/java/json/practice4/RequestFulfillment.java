package json.practice4;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestFulfillment {
    private String time;
    private int count;

    public RequestFulfillment() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RequestFulfillment{" +
                "time='" + time + '\'' +
                ", count=" + count +
                '}';
    }
}
