package com.ecommerce.models;

import com.ecommerce.enums.ProductCategory;

public class Product {

    private final String id;
    private final String description;
    private final ProductCategory productCategory;

    public Product(String id, String description, ProductCategory productCategory) {
        this.id = id;
        this.description = description;
        this.productCategory = productCategory;
    }

}
