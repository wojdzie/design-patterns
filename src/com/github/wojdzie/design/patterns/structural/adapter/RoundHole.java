package com.github.wojdzie.design.patterns.structural.adapter;

public class RoundHole {

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return getRadius() >= peg.getRadius();
    }
}
