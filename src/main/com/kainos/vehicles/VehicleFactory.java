package com.kainos.vehicles;

import com.kainos.vehicles.breaks.DiscBreaks;
import com.kainos.vehicles.breaks.VBreak;
import com.kainos.vehicles.drivesystems.Engine;
import com.kainos.vehicles.drivesystems.HumanLegs;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VehicleFactory {

    public static Vehicle getProperVehicle(float distanceInKm) {
        if (distanceInKm <= 2) {
            return new Bicycle(
                    new HumanLegs(3, 30),
                    new VBreak()
            );
        }

        return new Car(
                new Engine(),
                new DiscBreaks()
        );
    }
}
