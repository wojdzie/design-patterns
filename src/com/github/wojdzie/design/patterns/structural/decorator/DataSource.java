package com.github.wojdzie.design.patterns.structural.decorator;

public interface DataSource {

    void writeData(String data);
    String readData();
}
