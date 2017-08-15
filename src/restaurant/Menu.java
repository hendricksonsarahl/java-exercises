package restaurant;

import java.util.Date;

public class Menu {

    private String itemName;
    private Date lastUpdated;

    public Menu(String itemName, Date lastUpdated) {
        this.itemName = itemName;
        this.lastUpdated = lastUpdated;

    }

    // get/set itemName: to show the name of each menu item listed
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    // get/set lastUpdated: to show when the last change to the app was made
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
