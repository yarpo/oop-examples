package com.kainos.vehicles.drivesystems;

import static com.kainos.Logger.log;

public class Engine implements DrivingForce {

    private final float accelerationFactor = 30;
    private final float maxSpeed = 160;

    @Override
    public void run() {
        log("Brbr br br brruuuuum. Engine ON");
    }

    @Override
    public void stop() {
        log("Bruuuum m m .... Engine OFF");
    }

    @Override
    public float accelerate(float speed) {
        return speed + accelerationFactor;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }
}








