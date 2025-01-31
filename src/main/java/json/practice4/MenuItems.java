package json.practice4;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuItems {
    private int menuItemId;
    private String name;
    private String asset;
    private int quantity;

    public MenuItems() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "menuItemId=" + menuItemId +
                ", name='" + name + '\'' +
                ", asset='" + asset + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
