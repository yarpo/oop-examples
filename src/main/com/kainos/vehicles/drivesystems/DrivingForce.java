package com.kainos.vehicles.drivesystems;

public interface DrivingForce {

    void run();
    void stop();
    float accelerate(float speed);
    float getMaxSpeed();
}
