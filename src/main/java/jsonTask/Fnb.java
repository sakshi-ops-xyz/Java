package jsonTask;
import java.util.List;

public class Fnb {
    private int totalOrders;
    private int favouritesOrdersCount;
    private String averageDeliveryTime;
    private List<MenuItems> topOrderedItems;
    private List<MenuItems> leastOrderedItems;
    private List<RequestFulfillment> requestFulfillment;
    private MaxRequestsInADay maxRequestsInADay;
    private List<RealTimeOrders> realTimeOrders;

    public Fnb() {
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }


    public List<RequestFulfillment> getRequestFulfillment() {
        return requestFulfillment;
    }

    public void setRequestFulfillment(List<RequestFulfillment> requestFulfillment) {
        this.requestFulfillment = requestFulfillment;
    }

    public List<RealTimeOrders> getRealTimeOrders() {
        return realTimeOrders;
    }

    public void setRealTimeOrders(List<RealTimeOrders> realTimeOrders) {
        this.realTimeOrders = realTimeOrders;
    }

    public MaxRequestsInADay getMaxRequestsInADay() {
        return maxRequestsInADay;
    }

    public void setMaxRequestsInADay(MaxRequestsInADay maxRequestsInADay) {
        this.maxRequestsInADay = maxRequestsInADay;
    }

    public List<MenuItems> getTopOrderedItems() {
        return topOrderedItems;
    }

    public void setTopOrderedItems(List<MenuItems> topOrderedItems) {
        this.topOrderedItems = topOrderedItems;
    }

    public List<MenuItems> getLeastOrderedItems() {
        return leastOrderedItems;
    }

    public void setLeastOrderedItems(List<MenuItems> leastOrderedItems) {
        this.leastOrderedItems = leastOrderedItems;
    }

    public int getFavouritesOrdersCount() {
        return favouritesOrdersCount;
    }

    public void setFavouritesOrdersCount(int favouritesOrdersCount) {
        this.favouritesOrdersCount = favouritesOrdersCount;
    }

    public String getAverageDeliveryTime() {
        return averageDeliveryTime;
    }

    public void setAverageDeliveryTime(String averageDeliveryTime) {
        this.averageDeliveryTime = averageDeliveryTime;
    }
}
