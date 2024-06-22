package com.parkinglot.models.parkingStrategy;

import com.parkinglot.enums.ParkingSpotEnum;
import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.parkingspot.ParkingSpot;

import java.util.List;
import java.util.stream.Collectors;

public class NearestFirstStrategy implements ParkingStrategy {

    private final ParkingLot parkingLot;

    public NearestFirstStrategy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingSpot getParkingSpot(ParkingSpotEnum parkingSpotEnum) throws ParkingSpotUnavailableException {
        System.out.println("Assigning Parking spot with nearest first strategy");
        List<ParkingSpot> parkingSpotList = parkingLot.getParkingSpots().get(parkingSpotEnum);
        List<ParkingSpot> freeParkingSpots = parkingSpotList.stream().filter(parkingSpot -> !parkingSpot.isOccupied()).collect(Collectors.toList());
        if (freeParkingSpots.isEmpty()) {
            throw new ParkingSpotUnavailableException("No parking spot available");
        }

        ParkingSpot parkingSpot = freeParkingSpots.get(0);
        for(ParkingSpot ps : parkingLot.getParkingSpots().get(parkingSpotEnum)) {
            if (ps.getId().equals(parkingSpot.getId())) {
                ps.setOccupied(true);
            }
        }
        System.out.println("Parking spot assigned with nearest first strategy");
        return parkingSpot;
    }

}
