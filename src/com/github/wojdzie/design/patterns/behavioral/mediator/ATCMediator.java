package com.github.wojdzie.design.patterns.behavioral.mediator;

public class ATCMediator implements Mediator {

    private Flight flight;
    private Runway runway;
    private boolean isLandingOk;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return isLandingOk;
    }

    @Override
    public void setLandingStatus(boolean status) {
        isLandingOk = status;
    }
}
