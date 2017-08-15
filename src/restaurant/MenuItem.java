package restaurant;

public class MenuItem {

    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private Boolean whereNew = true;

    public MenuItem(double itemPrice, String itemDescription, String itemCategory, Boolean whereNew) {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.whereNew = whereNew;
    }

    // get/set itemPrice: to show the price of the selected menu item
    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    // get/set itemDescription: to show the description of the selected menu item
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    // get/set itemCategory: to show the associated category( or categories) of the selected menu item
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    // get/set

    public Boolean isWhereNew() {
        return whereNew;
    }

    public void setWhereNew(Boolean whereNew) {
        this.whereNew = whereNew;
    }
}

