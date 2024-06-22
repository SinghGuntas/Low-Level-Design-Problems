package com.parkinglot.service;

import com.parkinglot.interfaces.EventListener;
import com.parkinglot.models.DisplayBoard;
import com.parkinglot.models.events.Event;
import com.parkinglot.models.events.ParkingEntryEvent;

public class DisplayBoardService implements EventListener {

    private final DisplayBoard displayBoard;

    public DisplayBoardService() {
        this.displayBoard = DisplayBoard.getInstance();
    }

    @Override
    public void update(Event event) {
        System.out.println("Entering Display board service to update the board");
        ParkingEntryEvent parkingEntryEvent = (ParkingEntryEvent) event;
        System.out.println("Received event " + parkingEntryEvent);
        displayBoard.update();
    }
}
