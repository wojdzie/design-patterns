package com.github.wojdzie.design.patterns.creational.factorymethod;

public class SeaLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
