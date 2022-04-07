package com.kainos.vehicles.breaks;

public abstract class BreakSystem {

    public float emergencyBreaking(float speed) {
        return (float) Math.floor(speed/getDecelerationFactor());
    }

    public float decelerate(float speed) {
        if (speed > this.getDecelerationFactor()) {
            return Math.abs(speed) - getDecelerationFactor();
        }

        return 0;
    }

    protected abstract float getDecelerationFactor();
}
