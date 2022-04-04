package com.kainos.models;

public class Square implements Shape {

    private float length;

    public Square(float length) {
        this.length = length;
    }

    @Override
    public float area() {
        return length * length;
    }
}
