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
                    if (vehicle.getCurrentSpeed() >= 30) {
                        while (vehicle.getCurrentSpeed() > 30) {
                            vehicle.slowDown();
                        }
                    } else {
                        while (vehicle.getCurrentSpeed() < 30) {
                            vehicle.speedUp();
                        }
                    }
                    break;

                case LIMIT_50:
                    if (vehicle.getCurrentSpeed() >= 50) {
                        while (vehicle.getCurrentSpeed() > 50) {
                            vehicle.slowDown();
                        }
                    } else {
                        while (vehicle.getCurrentSpeed() < 50) {
                            vehicle.speedUp();
                        }
                    }
                    break;

//                case LIMIT_90:
//                    if (vehicle.getCurrentSpeed() >= 90) {
//                        while (vehicle.getCurrentSpeed() > 90) {
//                            vehicle.slowDown();
//                        }
//                    } else {
//                        while (vehicle.getCurrentSpeed() < 90) {
//                            vehicle.speedUp();
//                        }
//                    }
//                    break;
            }
        });

        while (vehicle.isMoving()) {
            vehicle.slowDown();
        }

        vehicle.stop();
    }
}
