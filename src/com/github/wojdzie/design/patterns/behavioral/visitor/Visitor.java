package com.github.wojdzie.design.patterns.behavioral.visitor;

public interface Visitor {

    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundShape(CompoundShape compoundShape);
}
