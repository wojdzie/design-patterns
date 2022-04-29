package com.github.wojdzie.design.patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth() * Math.sqrt(2) / 2);
        this.squarePeg = squarePeg;
    }
}
