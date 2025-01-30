package json.practice4;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaxRequestsInADay {
    private int quantity;
    private List<String> dates;

    public MaxRequestsInADay() {
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MaxRequestsInADay{" +
                "quantity=" + quantity +
                ", dates=" + dates +
                '}';
    }
}
