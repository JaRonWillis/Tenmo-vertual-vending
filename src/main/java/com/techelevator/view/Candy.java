package com.techelevator.view;

public class Candy extends Products implements Sellable {
    public static final String PRODUCT_TYPE_NAME = "Candy";
    private String slotID;

    //  private static final String PRODUCT_TYPE_NAME="Candy";
    public Candy(String slotID,String name, double price, int items_quantity) {
        super(name, price, items_quantity);
        this.slotID = slotID;
    }


    @Override
    public void sold() {
        this.items_quantity--;
    }
}
