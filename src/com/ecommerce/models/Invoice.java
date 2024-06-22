package com.ecommerce.models;

import java.util.UUID;

public class Invoice {

    private final String id;
    private final Order order;

    public Invoice(Order order) {
        id = UUID.randomUUID().toString();
        this.order = order;
    }
}
