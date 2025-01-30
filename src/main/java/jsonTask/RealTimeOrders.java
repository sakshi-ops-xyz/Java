package jsonTask;

import java.util.List;

public class RealTimeOrders {
    private String state;
    private List<MenuItems> items;
    private int count;

    public RealTimeOrders() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
