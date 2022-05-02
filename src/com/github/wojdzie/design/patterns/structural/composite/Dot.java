package com.github.wojdzie.design.patterns.structural.composite;

public class Dot implements Graphic {

    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        // Draw a dot at X and Y
    }
}
