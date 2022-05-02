package com.github.wojdzie.design.patterns.structural.flyweight;

import java.awt.*;

public class TreeType {

    private final String name;
    private final Color color;
    private final String data;

    public TreeType(String name, Color color, String data) {
        this.name = name;
        this.color = color;
        this.data = data;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
