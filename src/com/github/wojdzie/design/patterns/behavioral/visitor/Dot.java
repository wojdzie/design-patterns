package com.github.wojdzie.design.patterns.behavioral.visitor;

public class Dot implements Shape {

    private final int id;
    private final int x;
    private final int y;

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }


    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
