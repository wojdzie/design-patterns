package com.github.wojdzie.design.patterns.behavioral.command;

public class Sell implements Order {

    private final Stock stock;

    public Sell(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
