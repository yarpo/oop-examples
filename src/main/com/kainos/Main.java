package com.kainos;

import com.kainos.driving.Commands;
import com.kainos.driving.VehicleController;
import com.kainos.vehicles.VehicleFactory;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        // BreakSystem breakSystem = new BreakSystem() {
        //     @Override
        //     protected float getDecelerationFactor() {
        //         return 0;
        //     }
        // };

        // breakSystem.emergencyBreaking(100);


        // // this could be fetched from database or public API
        // vehicle.start();
        // vehicle.speedUp();
        // vehicle.speedUp();
        // vehicle.turnLeft();
        // vehicle.turnRight();
        // vehicle.slowDown();
        // vehicle.stop();

        float distance = 1f;

        VehicleController myRide = new VehicleController(
                VehicleFactory.getProperVehicle(distance),
                asList(
                        Commands.LIMIT_30,
                        Commands.LEFT,
                        Commands.LIMIT_50,
                        Commands.RIGHT,
                        Commands.LIMIT_30,
                        Commands.LEFT
                )
        );

        myRide.drive();
    }
}
