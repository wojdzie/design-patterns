package com.github.wojdzie.design.patterns.creational.singleton;

public class StaticFactorySingleton {

    private static final StaticFactorySingleton INSTANCE = new StaticFactorySingleton();

    private StaticFactorySingleton() {}

    public static StaticFactorySingleton getInstance() {
        return INSTANCE;
    }
}
