package com.techelevator.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private static List<Sellable> productsList = new ArrayList<Sellable>();

    // public static Products products=new Products();

    public static List<Sellable> getProductsList() {
        return productsList;
    }

    public static String itemDisplay() {
        List<String> sortProducts = new ArrayList<>();
        System.out.println("Products ready for purchase");
        for (int i = 0; i < getProductsList().size(); i++) {

            System.out.println(productsList.get(i));
            // sortProducts.add(getProductsList().get(i));
        }


        return "";
    }

    public static final void LOAD_ITEMS() {
        File file = new File("C:\\Users\\jaron\\capsule 1\\capstone-1\\vendingmachine.csv");

        try (Scanner inventory = new Scanner(file)) {
            while (inventory.hasNextLine()) {
                String lines = inventory.nextLine();
                String[] line = lines.split("\\|");
                // products = new Products()
                String slotID = line[0];
                String productName = line[1];
                double price = Double.parseDouble(line[2]);
                String itemType = line[3];
                //Products products =null;

                if (itemType.equalsIgnoreCase(Candy.PRODUCT_TYPE_NAME)) {
                    //  products = new Candy(productName, price, 5, slotID);
                    productsList.add(new Candy(slotID,productName,(price), 5));
                }
                // productsList.add(products.getSlotLocation(),products);
                if (itemType.equalsIgnoreCase(Chips.PRODUCT_TYPE_NAME)) {
                    // make sure to make double
                    productsList.add(new Chips(slotID,productName,(price), 5));

                } else if (itemType.equalsIgnoreCase(Beverages.PRODUCT_TYPE_NAME)) {
                    productsList.add(new Beverages(slotID,productName,(price), 5));
//                } else if (line[3].equals("Candy")) {
//                    productsList.add(new Candy(line[1], Double.parseDouble(line[2]), 5, line[0]));
                } else if (itemType.equalsIgnoreCase(Gum.PRODUCT_TYPE_NAME)) {
                    productsList.add(new Gum(slotID,productName,(price), 5));
                }

                //System.out.println("This product does not exist.");
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
    }


}
