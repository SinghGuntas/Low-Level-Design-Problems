package com.parkinglot.models.parkingspot;

public abstract class SpotDecorator extends ParkingSpot {
    // Decorator extends to the class which we are decorating or adding functionalities for

    protected ParkingSpot parkingSpot;

    public SpotDecorator(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
