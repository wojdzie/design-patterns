package com.github.wojdzie.design.patterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Render checkbox on Windows");
    }
}
