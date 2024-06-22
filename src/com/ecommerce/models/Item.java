package com.ecommerce.models;

public class Item {
    private final String id;
    private final String productId;
    private final Vendor vendor;
    private final double amount;

    public Item(String id, String productId, Vendor vendor, double amount) {
        this.id = id;
        this.productId = productId;
        this.vendor = vendor;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public double getAmount() {
        return amount;
    }
}
