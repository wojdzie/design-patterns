package com.github.wojdzie.design.patterns.structural.adapter;

public class SquarePeg {

    private final int width;

    public SquarePeg(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getSquare() {
        return width * width;
    }
}
