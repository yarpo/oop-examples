package com.kainos.vehicles.breaks;

public class DiscBreaks extends BreakSystem {

    @Override
    protected float getDecelerationFactor() {
        return 4;
    }
}
