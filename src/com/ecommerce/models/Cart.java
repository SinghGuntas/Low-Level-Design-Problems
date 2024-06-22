package com.ecommerce.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final String id;
    private List<Item> items;

    public Cart(String id) {
        this.id = id;
        this.items = new ArrayList<>();
    }
}
