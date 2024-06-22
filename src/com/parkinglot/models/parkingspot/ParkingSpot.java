package com.parkinglot.models.parkingspot;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ParkingSpot {

    public ParkingSpot() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.id = String.valueOf(atomicInteger.incrementAndGet());
    }

    public String getId() {
        return id;
    }

    private final String id;
    private boolean isOccupied;

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public abstract int cost(int parkingHours);
}
