package com.github.wojdzie.design.patterns.creational.abstractfactory;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Render button on MacOS");
    }
}
