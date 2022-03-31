package com.kainos.models;

import com.kainos.exceptions.Shape2DException;

public class Square implements Shape, Shape3D {

    private float length;

    public Square(float length) {
        this.length = length;
    }

    @Override
    public float area() {
        return length * length;
    }

    @Override
    public float volume() {
        throw new Shape2DException("Square is 2D!");
    }
}
