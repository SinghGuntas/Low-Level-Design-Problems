package com.parkinglot.models.parkingspot;

public class WashFeature extends SpotDecorator {

    public WashFeature(ParkingSpot parkingSpot) {
        super(parkingSpot);
    }

    @Override
    public int cost(int parkingHours) {
        return parkingSpot.cost(parkingHours) + parkingHours + 10;
    }
}
