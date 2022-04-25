package com.github.wojdzie.design.patterns.creational.prototype;

public class Circle extends Shape {

    private final int radius;

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }
}
