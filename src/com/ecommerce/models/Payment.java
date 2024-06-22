package com.ecommerce.models;

import com.ecommerce.enums.PaymentMethod;

import java.util.UUID;

public class Payment {

    private final String id;
    private final PaymentMethod paymentMethod;


    public Payment(PaymentMethod paymentMethod) {
        this.id = UUID.randomUUID().toString();
        this.paymentMethod = paymentMethod;
    }
}
