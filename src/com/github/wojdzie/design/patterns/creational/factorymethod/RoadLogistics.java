package com.github.wojdzie.design.patterns.creational.factorymethod;

public class RoadLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
