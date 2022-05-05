package com.github.wojdzie.design.patterns.behavioral.interpreter;

public class OrExpression implements Expression {

    private final Expression expressionOne;
    private final Expression expressionTwo;

    public OrExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean interpret(String context) {
        return expressionOne.interpret(context) || expressionTwo.interpret(context);
    }
}
