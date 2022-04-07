package com.kainos.vehicles.breaks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VBreakTest {

    @Test
    void getDecelerationFactor() {
        VBreak breaks = new VBreak();

        assertEquals(3, breaks.getDecelerationFactor());
    }
}