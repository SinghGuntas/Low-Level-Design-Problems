package com.parkinglot.models;

import com.parkinglot.enums.ParkingSpotEnum;
import com.parkinglot.models.parkingspot.CompactParkingSpot;
import com.parkinglot.models.parkingspot.ParkingSpot;

import java.util.*;

public class ParkingLot {
    private static ParkingLot parkingLot = null;

    private final String name;
    private final List<EntryPanel> entries;
    private final List<ExitPanel> exits;
    private final DisplayBoard displayBoard;
    Map<ParkingSpotEnum, List<ParkingSpot>> parkingSpots;


    public ParkingLot(String name) {
        this.name = name;
        List<ParkingSpot> compactParkingSpots = new ArrayList<>();
        compactParkingSpots.add(new CompactParkingSpot());
        this.parkingSpots = new HashMap<ParkingSpotEnum, List<ParkingSpot>>()
        {{
            put(ParkingSpotEnum.COMPACT, compactParkingSpots);
        }};
        this.entries = Collections.singletonList(new EntryPanel("Entry Panel 1"));
        this.exits = Collections.singletonList(new ExitPanel("Exit Panel 1"));
        this.displayBoard = new DisplayBoard();
    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot("Parking Lot");
        }
        return parkingLot;
    }

    public String getName() {
        return name;
    }

    public List<EntryPanel> getEntries() {
        return entries;
    }

    public List<ExitPanel> getExits() {
        return exits;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public Map<ParkingSpotEnum, List<ParkingSpot>> getParkingSpots() {
        return parkingSpots;
    }
}
