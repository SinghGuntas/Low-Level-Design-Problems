package com.parkinglot;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.exceptions.VehichleNotSupportedException;
import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehichle;
import com.parkinglot.models.parkingspot.WashFeature;
import com.parkinglot.service.ParkingServiceImpl;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("First Parking lot");

        ParkingServiceImpl parkingService = new ParkingServiceImpl(parkingLot);
        try {
            Ticket ticket1 = parkingService.entry(new Vehichle("1", VehicleType.BIKE));
            Ticket ticket2 = parkingService.entry(new Vehichle("1", VehicleType.AUTO));

            ticket1.setParkingSpot(new WashFeature(ticket1.getParkingSpot()));
        } catch (VehichleNotSupportedException | ParkingSpotUnavailableException e) {
            e.printStackTrace();
        }

    }
}

