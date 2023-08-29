package org.launchcode;

public class MenuItems {
    //FIELD VARIABLES
    private String category;
    private Double price;
    private String description;
    private boolean isNew = true;
    private String name;

    //CONSTRUCTOR
    public MenuItems(String category, Double price, String description, String name, boolean isNew) {
        this.category = category;
        this.price = price;
        this.description = description;
        this.name = name;
        this.isNew = isNew;
    }

    //GETTERS AND SETTERS
    public String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public boolean getIsNew() {
        return isNew;
    }

    void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
