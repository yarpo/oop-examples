package com.kainos.vehicles;

import static com.kainos.Logger.log;

public class Bicycle implements Vehicle {

    private final float maxSpeed;
    private float currentSpeed;
    private boolean moving;

    public Bicycle(float maxSpeed) {
        this.currentSpeed = 0;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void stop() {

        while (currentSpeed > 0) {
            currentSpeed = Math.abs(currentSpeed) - 1;
            log("Current speed of my bike = " + currentSpeed);
        }

        currentSpeed = 0;
        moving = false;
        log("I have stopped.");
    }

    @Override
    public void start() {

        if (moving) {
            log("I'm already moving!");
        } else {
            moving = true;
            currentSpeed = 1;

            if (currentSpeed > maxSpeed) {
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
        if (moving) {
            currentSpeed = (float) Math.floor(currentSpeed - currentSpeed * 0.1);
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
            currentSpeed = currentSpeed + (float) (currentSpeed * 0.1);
            if (currentSpeed > maxSpeed) {
                currentSpeed = maxSpeed;
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
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean isMoving() {
        return moving;
    }
}
