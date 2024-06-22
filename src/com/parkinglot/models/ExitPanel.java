package com.parkinglot.models;

import java.util.concurrent.atomic.AtomicInteger;

public class ExitPanel {
    private final int id;

    public ExitPanel(String id) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.id = atomicInteger.incrementAndGet();
    }

    public int getId() {
        return id;
    }

}
