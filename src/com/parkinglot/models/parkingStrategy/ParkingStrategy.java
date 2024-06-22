package com.parkinglot.models.parkingStrategy;

import com.parkinglot.enums.ParkingSpotEnum;
import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.models.parkingspot.ParkingSpot;

public interface ParkingStrategy {
    ParkingSpot getParkingSpot(ParkingSpotEnum parkingSpotEnum) throws ParkingSpotUnavailableException;
}
