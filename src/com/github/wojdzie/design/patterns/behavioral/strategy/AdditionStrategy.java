package com.github.wojdzie.design.patterns.behavioral.strategy;

public class AdditionStrategy implements CalculationStrategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
