package com.github.wojdzie.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private final List<Graphic> children = new ArrayList<>();

    void add(Graphic child) {
        children.add(child);
    }

    void add(Graphic...components) {
        children.addAll(Arrays.asList(components));
    }

    void remove(Graphic child) {
        children.remove(child);
    }

    void remove(Graphic...components) {
        children.removeAll(Arrays.asList(components));
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        // 1. For each child component:
        //     - draw the component
        //     - update the bounding rectangle
        // 2. Draw a dashed rectangle using the bounding coordinates
    }
}
