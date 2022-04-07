package com.kainos.vehicles.drivesystems;

import lombok.RequiredArgsConstructor;

import static com.kainos.Logger.log;

@RequiredArgsConstructor
public class HumanLegs implements DrivingForce {

    private final float accelerationFactor;
    private final float maxSpeed;

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








