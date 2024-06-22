package com.ecommerce.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {

    private final String Id;
    private final String name;
    private List<Address> addresses;
    private final Cart cart;

    public Customer(String id, String name) {
        Id = id;
        this.name = name;
        this.addresses = new ArrayList<>();
        cart = new Cart(UUID.randomUUID().toString());
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }
}
