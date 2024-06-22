package com.parkinglot.interfaces;

import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.exceptions.VehichleNotSupportedException;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehichle;

public interface ParkingService {

    Ticket entry(Vehichle vehichle) throws ParkingSpotUnavailableException, VehichleNotSupportedException;
    int exit();

}
