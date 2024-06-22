package com.parkinglot.models.parkingspot;

public class CompactParkingSpot extends ParkingSpot {
    public CompactParkingSpot() {
        super();
    }


    @Override
    public int cost(int parkingHours) {
        return parkingHours * 20;
    }
}
