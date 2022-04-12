package com.github.wojdzie.design.patterns.creational.abstractfactory;

public class MacCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Render checkbox on MacOS");
    }
}
