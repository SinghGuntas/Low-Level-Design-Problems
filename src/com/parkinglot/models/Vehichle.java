package com.parkinglot.models;

import com.parkinglot.enums.VehicleType;

public class Vehichle {

    private final String id;
    private final VehicleType vehicleType;

    public Vehichle(String id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    public String getId() {
        return id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
