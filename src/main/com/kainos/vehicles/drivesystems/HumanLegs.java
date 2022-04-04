package com.kainos.vehicles.drivesystems;

import static com.kainos.Logger.log;

public class HumanLegs implements DrivingForce {

    private final float accelerationFactor;
    private final float maxSpeed;

    public HumanLegs(float accelerationFactor, float maxSpeed) {
        this.accelerationFactor = accelerationFactor;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void run() {
        log("Let me stretch a bit");
    }

    @Override
    public void stop() {
        log("Finally. My legs are burning");
    }

    @Override
    public float accelerate(float speed) {
        return speed + speed * accelerationFactor;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }

    public static DrivingForce elderlyGentleman() {
        return new HumanLegs(0.01f, 10);
    }

    public static DrivingForce professionalCyclist() {
        return new HumanLegs(2, 100);
    }
}
