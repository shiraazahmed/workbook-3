package com.pluralsight;

import java.util.ArrayList;

public class searchInventory {
    public static void main(String[] args) {
        ArrayList<String> inventory = getInventory();

        System.out.println("Store Inventory:");
        for (String item : inventory) {
            System.out.println(item);
        }
    }
    public static ArrayList<String> getInventory() {
        ArrayList<String> products = new ArrayList<>();
        products.add(String.valueOf(new Product(01,"Footballs",5)));
        products.add(String.valueOf(new Product(02,"Jerseys",100)));
        products.add(String.valueOf(new Product(03,"Sweatpants", 30)));
        products.add(String.valueOf(new Product(04,"Sports gloves", 10)));
        products.add(String.valueOf(new Product(05,"Cleats",80)));
        System.out.println(products);

        return products;
    }
}
