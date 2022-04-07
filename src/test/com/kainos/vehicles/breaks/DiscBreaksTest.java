package com.kainos.vehicles.breaks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscBreaksTest {

    @Test
    void getDecelerationFactor() {
        DiscBreaks breaks = new DiscBreaks();

        assertEquals(4, breaks.getDecelerationFactor());
    }
}