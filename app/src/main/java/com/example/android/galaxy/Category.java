package com.example.android.galaxy;


/**
 * Created by Arif Ikhsanudin on Tuesday, 30 October 2018.
 */

public class Category {

    int id;
    String name;

    Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
