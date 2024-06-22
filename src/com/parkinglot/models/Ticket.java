package com.parkinglot.models;

import com.parkinglot.models.parkingspot.ParkingSpot;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Ticket {

    private final int id;
    private final AtomicInteger atomicInteger = new AtomicInteger();
    private ParkingSpot parkingSpot;

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    private final Vehichle vehichle;
    private final LocalDateTime createdAt;

    public Ticket(ParkingSpot parkingSpot, Vehichle vehichle) {
        this.id = atomicInteger.incrementAndGet();
        this.parkingSpot = parkingSpot;
        this.vehichle = vehichle;
        createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehichle getVehichle() {
        return vehichle;
    }
}
