package com.ecommerce.models;

public class Address {

    private final String id;
    private final String line1;
    private final String postalCode;
    private final String city;
    private final String state;
    private final String country;

    public Address(String id, String line1, String postalCode, String city, String state, String country) {
        this.id = id;
        this.line1 = line1;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
