package jsonTask;

import java.util.List;

public class MaxRequestsInADay {
    private int quantity;
    private List<String> dates;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public MaxRequestsInADay() {
    }
}
