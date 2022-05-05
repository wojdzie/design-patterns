package com.github.wojdzie.design.patterns.behavioral.mediator;

public class Runway implements Command {

    private final Mediator mediator;

    public Runway(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        mediator.setLandingStatus(true);
    }
}
