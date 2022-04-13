package com.github.wojdzie.design.patterns.creational.builder;

public class Car {

    private String company;
    private String model;
    private String color;
    private String engine;
    private int seats;

    private Car() {}

    private Car(CarBuilder carBuilder) {
        this.company = carBuilder.company;
        this.model = carBuilder.model;
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;
        this.seats = carBuilder.seats;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    private static class CarBuilder {
        String company;
        String model;
        String color;
        String engine;
        int seats;

        public CarBuilder(String company, String model) {
            this.company = company;
            this.model = model;
        }

        public CarBuilder company(String company) {
            this.company = company;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
