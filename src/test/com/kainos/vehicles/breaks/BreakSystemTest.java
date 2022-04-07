package com.kainos.vehicles.breaks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakSystemTest {

    @Test
    void emergencyBreakingShouldSlowDownDrastically() {
        BreakSystem breaks = new MyBreakImpl();

        assertEquals(50, breaks.emergencyBreaking(100));
        assertEquals(25, breaks.emergencyBreaking(50));
        assertEquals(0, breaks.emergencyBreaking(1));
        assertEquals(0, breaks.emergencyBreaking(0));
    }

    @Test
    void decelerateShouldSlowDownAsExpected() {
        BreakSystem breaks = new MyBreakImpl();

        assertEquals(98, breaks.decelerate(100));
        assertEquals(96, breaks.decelerate(98));
        assertEquals(0, breaks.decelerate(2));
        assertEquals(0, breaks.decelerate(0));
    }

    @Test
    void getDecelerationFactorReturnsValidValue() {
        BreakSystem breaks = new MyBreakImpl();

        assertEquals(2, breaks.getDecelerationFactor());
    }

    // We call it a stub
    private static class MyBreakImpl extends BreakSystem {
        @Override
        protected float getDecelerationFactor() {
            return 2;
        }
    }
}