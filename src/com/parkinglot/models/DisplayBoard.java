package com.parkinglot.models;

import com.parkinglot.enums.ParkingSpotEnum;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard {

    Map<ParkingSpotEnum, Integer> freeParkingSpotsCount;

    private static DisplayBoard displayBoard = null;

    public DisplayBoard() {
        this.freeParkingSpotsCount = new HashMap<ParkingSpotEnum, Integer>()
        {{
            put(ParkingSpotEnum.COMPACT, 0);
        }};
    }

    public void update() {
        System.out.println("Updating display board service");
    }


    public static DisplayBoard getInstance() {
        if (displayBoard == null) {
            displayBoard = new DisplayBoard();
        }
        return displayBoard;
    }

}
