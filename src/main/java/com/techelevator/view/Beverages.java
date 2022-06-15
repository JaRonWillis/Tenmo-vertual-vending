package com.techelevator.view;

public class Beverages extends Products implements Sellable {
    public static final String PRODUCT_TYPE_NAME = "Beverage";
    private String slotID;

    public Beverages(String slotID,String name, double price, int items_quantity) {
        super(name, price, items_quantity);
        this.slotID = slotID;
    }
    @Override
    public void sold() {
        this.items_quantity--;
    }
}
