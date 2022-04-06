package com.kainos.vehicles;

import com.kainos.vehicles.breaks.BreakSystem;
import com.kainos.vehicles.drivesystems.DrivingForce;

import static com.kainos.Logger.log;

public class Bicycle implements Vehicle {

    private final DrivingForce drivingForce;
    private final BreakSystem breakSystem;
    private float currentSpeed;
    private boolean moving;

    public Bicycle(DrivingForce drivingForce, BreakSystem breakSystem) {
        this.drivingForce = drivingForce;
        this.breakSystem = breakSystem;
    }

    @Override
    public void stop() {

        if (!isMoving()) {
            log("I'm not moving at all. I can't stop'.");
            return;
        }

        while (currentSpeed > 0) {
            currentSpeed = breakSystem.emergencyBreaking(currentSpeed);
            log("Current speed of my bike = " + currentSpeed);
        }

        currentSpeed = 0;
        moving = false;
        log("I have stopped.");
    }

    @Override
    public void start() {

        if (isMoving()) {
            log("I'm already moving!");
        } else {
            moving = true;
            currentSpeed = 1;

            if (currentSpeed > drivingForce.getMaxSpeed()) {
                throw new RuntimeException("You're too slow to ride a bike!");
            }

            log("I have started. Current speed of my bike = " + currentSpeed);
        }
    }

    @Override
    public void turnLeft() {
        log("I'm turning left");
    }

    @Override
    public void turnRight() {
        log("I'm turning right");
    }

    @Override
    public void slowDown() {
        if (isMoving()) {
            currentSpeed = breakSystem.decelerate(currentSpeed);
            if (currentSpeed <= 0) {
                currentSpeed = 0;
                moving = false;
                log("I'm not moving anymore!");
            } else {
                log("I slowed down. My current speed is " + currentSpeed);
            }
        } else {
            log("I'm not moving!");
        }
    }

    @Override
    public void speedUp() {
        if (moving) {
            currentSpeed = drivingForce.accelerate(currentSpeed);
            if (currentSpeed >= drivingForce.getMaxSpeed()) {
                currentSpeed = drivingForce.getMaxSpeed();
                log("I can't go any faster!");
            } else {
                log("I'm going faster. My current speed is " + currentSpeed);
            }
        } else {
            log("I'm not moving!");
        }
    }

    @Override
    public float getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public boolean isMoving() {
        return moving;
    }

    @Override
    public boolean canGoFaster() {
        return currentSpeed < drivingForce.getMaxSpeed();
    }
}
