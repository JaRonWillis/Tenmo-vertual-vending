package com.techelevator.view;

public class Chips extends Products implements Sellable {
    public static final String PRODUCT_TYPE_NAME = "Chips";
    private String slotID;

    public Chips(String slotID,String name, double price, int items_quantity) {
        super(name, price, items_quantity);
        this.slotID = slotID;
    }

    @Override
    public void sold() {
        this.items_quantity--;
    }
}