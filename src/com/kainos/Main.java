package com.kainos;

import com.kainos.models.Circle;
import com.kainos.models.Shape;
import com.kainos.models.Square;
import com.kainos.services2.BusinessLogicService;
import com.kainos.services2.MySqlConnection;
import com.kainos.services2.SqliteConnection;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(
                new Square(12),
                new Circle(4)
        );

        shapes.forEach((Shape shape) -> {
            System.out.println(shape.area());
        });

        // you can see how I can use the fact `BusinessLogicService` expects interface and not concrete class
        BusinessLogicService logic1 = new BusinessLogicService(new MySqlConnection()); // for MySql
        BusinessLogicService logic2 = new BusinessLogicService(new SqliteConnection()); // for Sqlite

        logic1.saveData("works with MySql!");
        logic2.saveData("works with Sqlite!!");

        // homework:
        // how to add Oracle?
    }
}
