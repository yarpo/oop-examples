package com.kainos.driving;

import com.kainos.vehicles.Vehicle;

import java.util.List;

public class VehicleController {

    private final Vehicle vehicle;
    private final List<Commands> commands;

    public VehicleController(Vehicle vehicle, List<Commands> commands) {
        this.vehicle = vehicle;
        this.commands = commands;
    }

    public void drive() {
        vehicle.start();

        commands.forEach(action -> {
            switch (action) {
                case LEFT:
                    vehicle.turnLeft();
                    break;

                case RIGHT:
                    vehicle.turnRight();
                    break;

                case LIMIT_30:
                    driveWithSpeedLimit(30);
                    break;

                case LIMIT_50:
                    driveWithSpeedLimit(50);
                    break;
            }
        });

        while (vehicle.isMoving()) {
            vehicle.slowDown();
        }

        vehicle.stop();
    }

    private void driveWithSpeedLimit(int limit) {
        if (vehicle.getCurrentSpeed() >= limit) {
            while (vehicle.getCurrentSpeed() > limit) {
                vehicle.slowDown();
            }
        } else {
            while (vehicle.getCurrentSpeed() < limit && vehicle.canGoFaster()) {
                vehicle.speedUp();
            }
        }
    }
}
