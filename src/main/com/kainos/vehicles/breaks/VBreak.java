package com.kainos.vehicles.breaks;

public class VBreak extends BreakSystem {

    @Override
    protected float getDecelerationFactor() {
        return 3;
    }
}
