package com.kainos.vehicles;

public interface Vehicle {
    void stop();
    void start();

    void turnLeft();
    void turnRight();

    void slowDown();
    void speedUp();

    float getCurrentSpeed();
    boolean isMoving();
}
