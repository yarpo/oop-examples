package com.kainos.models;

public class Cuboid implements Shape, Shape3D {
    private float a;
    private float b;
    private float h;

    public Cuboid(float a, float b, float h) {
        this.a = a;
        this.b = a;
        this.h = a;
    }

    /**
     * Even though both public methods are annotated with @Override, please mind
     * they are implementing two different interfaces
     * */
    @Override // from Shape
    public float area() {
        return 2 * a * b + 2 * a * h + 2 * b * h;
    }

    @Override // from Shape3D
    public float volume() {
        return a * b * h;
    }
}
