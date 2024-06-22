package com.parkinglot.models.parkingspot;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ParkingSpot {

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    public ParkingSpot() {
        this.id = String.valueOf(atomicInteger.incrementAndGet());
    }

    public String getId() {
        return id;
    }

    private final String id;
    private boolean isOccupied;
    int cost;

    public abstract int cost();

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
