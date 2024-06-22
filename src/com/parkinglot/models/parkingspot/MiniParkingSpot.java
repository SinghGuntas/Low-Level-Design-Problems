package com.parkinglot.models.parkingspot;

public class MiniParkingSpot extends ParkingSpot {


    public MiniParkingSpot() {
        super();
    }


    @Override
    public int cost(int parkingHours) {
        return parkingHours * 10;
    }
}
