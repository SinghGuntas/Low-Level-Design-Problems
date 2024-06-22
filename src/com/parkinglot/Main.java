package com.parkinglot;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.exceptions.VehichleNotSupportedException;
import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.Vehichle;
import com.parkinglot.service.ParkingServiceImpl;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("First Parking lot");

        ParkingServiceImpl parkingService = new ParkingServiceImpl(parkingLot);
        try {
            parkingService.entry(new Vehichle("1", VehicleType.BIKE));
            parkingService.entry(new Vehichle("1", VehicleType.AUTO));
        } catch (VehichleNotSupportedException | ParkingSpotUnavailableException e) {
            e.printStackTrace();
        }

    }
}

