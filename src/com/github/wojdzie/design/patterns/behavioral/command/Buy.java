package com.github.wojdzie.design.patterns.behavioral.command;

public class Buy implements Order {

    private final Stock stock;

    public Buy(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
