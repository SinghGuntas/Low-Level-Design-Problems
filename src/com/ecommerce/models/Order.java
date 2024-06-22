package com.ecommerce.models;

import com.ecommerce.enums.OrderStatus;

import java.util.List;
import java.util.UUID;

public class Order {
    private final String Id;
    private List<Item> itemList;
    private final OrderStatus orderStatus;
    private final Payment payment;
    private final Double amount;
    private final Delivery delivery;

    public Order(List<Item> itemList, Payment payment, Delivery delivery) {
        this.itemList = itemList;
        this.payment = payment;
        this.amount = itemList.stream().mapToDouble(Item::getAmount).sum();
        this.delivery = delivery;
        this.Id = UUID.randomUUID().toString();
        this.orderStatus = OrderStatus.PROCESSING;
    }
}
