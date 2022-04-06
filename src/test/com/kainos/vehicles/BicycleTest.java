package com.kainos.vehicles;

import com.kainos.vehicles.breaks.BreakSystem;
import com.kainos.vehicles.drivesystems.DrivingForce;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class BicycleTest {

    @Mock
    DrivingForce mockDrivingForce;

    @Mock
    BreakSystem mockBreakSystem;

    @Test
    void stop() {
        Vehicle bicycle = new Bicycle(mockDrivingForce, mockBreakSystem);
    }

    @Test
    void start() {
    }

    @Test
    void turnLeft() {
    }

    @Test
    void turnRight() {
    }

    @Test
    void slowDown() {
    }

    @Test
    void speedUp() {
    }

    @Test
    void getCurrentSpeed() {
    }

    @Test
    void isMoving() {
    }

    @Test
    void canGoFaster() {
    }
}