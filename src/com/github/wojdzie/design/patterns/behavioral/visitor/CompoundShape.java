package com.github.wojdzie.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {

    private final int id;
    private final List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
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
        return visitor.visitCompoundShape(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }

    public List<Shape> getChildren() {
        return children;
    }
}
