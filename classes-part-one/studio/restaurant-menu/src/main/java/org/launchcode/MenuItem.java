package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String desc;
    private String cat;
    private boolean newItem;
    
    public MenuItem(String name, double price, String desc, String cat, boolean newItem) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        if (Objects.equals(cat, "Appetizer") || Objects.equals(cat, "Main Course") || Objects.equals(cat, "Dessert")) {
            this.cat = cat;
        } else {
            throw new Error("Invalid Category");
        }
        this.newItem = newItem;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String getCat() {
        return cat;
    }
    
    public void setCat(String cat) {
        this.cat = cat;
    }
    
    public boolean isNewItem() {
        return newItem;
    }
    
    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
}
