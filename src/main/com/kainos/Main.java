package com.kainos;

import com.kainos.vehicles.Vehicle;
import com.kainos.vehicles.VehicleFactory;

public class Main {

    public static void main(String[] args) {

//        List<Shape> shapes = asList(
//                new Square(12),
//                new Circle(4)
//        );
//
//        shapes.forEach((Shape shape) -> {
//            System.out.println(shape.area());
//        });
//
//        // you can see how I can use the fact `BusinessLogicService` expects interface and not concrete class
//        BusinessLogicService logic1 = new BusinessLogicService(new MySqlConnection()); // for MySql
//        BusinessLogicService logic2 = new BusinessLogicService(new SqliteConnection()); // for Sqlite
//
//        logic1.saveData("works with MySql!");
//        logic2.saveData("works with Sqlite!!");

        // homework:
        // how to add Oracle?
//
//        BreakSystem breakSystem = new BreakSystem() {
//            @Override
//            protected float getDecelerationFactor() {
//                return 0;
//            }
//        };
//
//        breakSystem.emergencyBreaking(100);
//
//        Vehicle bike = new Bicycle(
//                HumanLegs.elderlyGentleman(),
//                new VBreak()
//        );
//
//        bike.start();
//        bike.speedUp();
//        bike.speedUp();
//        bike.turnLeft();
//        bike.turnRight();
//        bike.slowDown();
//        bike.stop();

        // this could be fetched from database or public API
        float distance = 1f;

        Vehicle vehicle = VehicleFactory.getProperVehicle(distance);
        vehicle.start();
        vehicle.speedUp();
        vehicle.speedUp();
        vehicle.turnLeft();
        vehicle.turnRight();
        vehicle.slowDown();
        vehicle.stop();










//
//
//
//
//        VehicleController myRide = new VehicleController(
//                new Bicycle(
//                        HumanLegs.professionalCyclist(),
//                        new DiscBreaks()
//                ),
//                asList(
//                        Commands.LIMIT_30,
//                        Commands.LEFT,
//                        Commands.LIMIT_50,
//                        Commands.RIGHT,
//                        Commands.LIMIT_30,
//                        Commands.LEFT
//                )
//        );
//
//        myRide.drive();
    }
}
