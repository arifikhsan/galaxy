package com.example.android.galaxy;

/**
 * Created by Arif Ikhsanudin on Tuesday, 30 October 2018.
 */

public class Galaxy {

    private String name, description;
    private Category category;

    Galaxy(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    int getCategoryId() {
        return category.getId();
    }

    String getCategoryName() {
        return category.getName();
    }

}
