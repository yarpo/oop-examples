package com.kainos.vehicles;

import com.kainos.vehicles.breaks.BreakSystem;
import com.kainos.vehicles.drivesystems.HumanLegs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

class BicycleTest {

    @Test
    void stopWhenNotMovingShouldNotCallBreakSystem() {
        BreakSystem mockBreakSystem = mock(BreakSystem.class);

        Vehicle bicycle = new Bicycle(HumanLegs.elderlyGentleman(), mockBreakSystem);

        assertFalse(bicycle.isMoving());
        bicycle.stop();
        assertFalse(bicycle.isMoving());

        verifyNoMoreInteractions(mockBreakSystem);
    }

    @Test
    void stopWhenMovingShouldCallBreakSystem() {
        BreakSystem mockBreakSystem = mock(BreakSystem.class);
        when(mockBreakSystem.emergencyBreaking(1))
                .thenReturn(0f);

        Vehicle bicycle = new Bicycle(HumanLegs.elderlyGentleman(), mockBreakSystem);

        assertFalse(bicycle.isMoving());
        bicycle.start();
        assertTrue(bicycle.isMoving());
        bicycle.stop();
        assertFalse(bicycle.isMoving());

        verify(mockBreakSystem, times(1)).emergencyBreaking(1);
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