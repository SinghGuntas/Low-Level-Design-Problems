package com.parkinglot.service;

import com.parkinglot.enums.ParkingSpotEnum;
import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.exceptions.VehichleNotSupportedException;
import com.parkinglot.interfaces.EventListener;
import com.parkinglot.interfaces.ParkingService;
import com.parkinglot.models.events.ParkingEntryEvent;
import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehichle;
import com.parkinglot.models.parkingStrategy.NearestFirstStrategy;
import com.parkinglot.models.parkingStrategy.ParkingStrategy;
import com.parkinglot.models.parkingspot.ParkingSpot;

import java.util.Arrays;
import java.util.List;

public class ParkingServiceImpl implements ParkingService {

    private final ParkingLot parkingLot;
    private final ParkingStrategy parkingStrategy;
    private final List<EventListener> listenerList;

    public ParkingServiceImpl(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.parkingStrategy = new NearestFirstStrategy(parkingLot);
        this.listenerList = Arrays.asList(new DisplayBoardService());
    }

    @Override
    public Ticket entry(Vehichle vehichle) throws ParkingSpotUnavailableException, VehichleNotSupportedException {
        System.out.println("Car with vehicle no " + vehichle.getId() + " is entering");
        ParkingSpot parkingSpot = assignParkingSpot(vehichle);
        Ticket ticket = new Ticket(parkingSpot, vehichle);
        sendVehicleEntryEvent(vehichle, parkingSpot);
        return ticket;
    }

    void sendVehicleEntryEvent(Vehichle vehichle, ParkingSpot parkingSpot) {
        System.out.println("Sending vehicle entry event");
        ParkingEntryEvent parkingEntryEvent = new ParkingEntryEvent(vehichle, parkingSpot);
        listenerList.forEach(eventListener -> eventListener.update(parkingEntryEvent));
    }

    private ParkingSpot assignParkingSpot(Vehichle vehichle) throws ParkingSpotUnavailableException, VehichleNotSupportedException {
        System.out.println("Assigning parking spot to vehicle " + vehichle.getId());
        switch (vehichle.getVehicleType()) {
            case CAR:
            case AUTO:
                return this.parkingStrategy.getParkingSpot(ParkingSpotEnum.MINI);
            case BIKE:
                return this.parkingStrategy.getParkingSpot(ParkingSpotEnum.COMPACT);
        }
        throw new VehichleNotSupportedException("Vehicle of type " + vehichle.getVehicleType() + " not supported.");
    }

    @Override
    public int exit() {
        return 0;
    }
}
