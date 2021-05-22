package com.company;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew = true;

    public MenuItem (String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


}