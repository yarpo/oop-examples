package com.kainos.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    public static final float VERY_SHORT_DISTANCE = 0.2f;
    public static final float SHORT_DISTANCE = 1.9f;

    public static final float TOO_MUCH_FOR_BIKE = 3f;
    public static final float TRAVEL = 100f;

    @Test
    void getProperVehicleShouldReturnBicycleWhenShortDistance() {
        assertTrue(VehicleFactory.getProperVehicle(VERY_SHORT_DISTANCE) instanceof Bicycle);
        assertTrue(VehicleFactory.getProperVehicle(SHORT_DISTANCE) instanceof Bicycle);
    }

    @Test
    void getProperVehicleShouldReturnCarWhenTooLongForBike() {
        assertTrue(VehicleFactory.getProperVehicle(TOO_MUCH_FOR_BIKE) instanceof Car);
        assertTrue(VehicleFactory.getProperVehicle(TRAVEL) instanceof Car);
    }
}