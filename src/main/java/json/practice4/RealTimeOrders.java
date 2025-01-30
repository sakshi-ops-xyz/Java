package json.practice4;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealTimeOrders {
    private String state;
    private int count;
    private List<MenuItems> items;

    public RealTimeOrders() {
    }

    public List<MenuItems> getItems() {
        return items;
    }

    public void setItems(List<MenuItems> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "RealTimeOrders{" +
                "state='" + state + '\'' +
                ", count=" + count +
                ", items=" + items +
                '}';
    }
}
