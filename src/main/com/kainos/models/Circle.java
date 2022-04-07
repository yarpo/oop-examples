package com.kainos.models;

public class Circle implements Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        /*
          I need to cast PI to float because it's double.
          If you multiply double * float you get double.

          I wanted to keep float as Shape interface defines.
          */
        return (float) Math.PI * radius * radius;
    }
}
