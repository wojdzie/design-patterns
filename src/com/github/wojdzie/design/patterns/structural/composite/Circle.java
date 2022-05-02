package com.github.wojdzie.design.patterns.structural.composite;

public class Circle extends Dot {

    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Draw a circle at X and Y with given radius
    }
}
