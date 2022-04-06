package com.kainos.vehicles.drivesystems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HumanLegsTest {

    @Test
    void accelerate() {
        DrivingForce force = new HumanLegs(3, 2);
        assertEquals(40, force.accelerate(10));
    }

    @Test
    void getMaxSpeed() {
        DrivingForce force = new HumanLegs(1, 2);
        assertEquals(2, force.getMaxSpeed());
    }

    @Test
    void elderlyGentleman() {
        DrivingForce force = HumanLegs.elderlyGentleman();

        assertTrue(force instanceof HumanLegs);
    }

    @Test
    void professionalCyclist() {
        DrivingForce force = HumanLegs.professionalCyclist();

        assertTrue(force instanceof HumanLegs);
    }
}
