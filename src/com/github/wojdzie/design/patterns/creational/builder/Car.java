package com.github.wojdzie.design.patterns.creational.builder;

public class Car {

    private String brand;
    private String model;
    private String color;

    private Car(CarBuilder builder) {
           this.brand = builder.brand;
           this.model = builder.model;
           this.color = builder.color;
    }

    private Car() {}

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    private static class CarBuilder {

        private String brand;
        private String model;
        private String color;

        public CarBuilder brand(String brand) {
            this.brand = brand;
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

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String...args) {
        Car car = Car.builder()
                .brand("Chevrolet")
                .model("Camaro")
                .color("yellow")
                .build();
    }
}
