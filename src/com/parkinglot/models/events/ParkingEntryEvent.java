package com.parkinglot.models.events;

import com.parkinglot.models.Vehichle;
import com.parkinglot.models.parkingspot.ParkingSpot;

public class ParkingEntryEvent implements Event {

    private final Vehichle vehichle;

    public Vehichle getVehichle() {
        return vehichle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public ParkingEntryEvent(Vehichle vehichle, ParkingSpot parkingSpot) {
        this.vehichle = vehichle;
        this.parkingSpot = parkingSpot;
    }

    private final ParkingSpot parkingSpot;

}
