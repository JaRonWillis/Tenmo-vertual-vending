package com.techelevator.view;


public class Products implements Sellable {
    public int items_quantity = 5;
    private String productName;
    public double price;
    public String slotID;
    public String category;




    public String toString() {
        return slotID + "|" + productName + "|" + price + "|" + items_quantity ;

    }

    public Products(String name, double price, int items_quantity) {
        this.productName = name;
        this.price = price;
        this.items_quantity = items_quantity;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getSlotID() {return slotID;}

    // public String getLocation() {
    //   return location;
    //  }

//    public void setLocation(String location) {
//        this.location = location;
//    }

//    private String location;


    // constructor
    public Products(String slotID, String name, double price, String category, int items_quantity) {
        this.slotID = slotID;
        this.productName = name;
        this.price = price;
        this.category = category;
        this.items_quantity = items_quantity;

    }

    //getters
    public int getItems_quantity() {
        return items_quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    //setters
    public void setItems_quantity(int items_quantity) {
        this.items_quantity = items_quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public void sold() {

    }
}