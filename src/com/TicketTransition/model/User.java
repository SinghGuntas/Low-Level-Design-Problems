package com.TicketTransition.model;

import java.util.UUID;

public class User {
    private final String id;
    private final String name;

    public User(String name) {
        id = UUID.randomUUID().toString();
        this.name = name;
    }

}
