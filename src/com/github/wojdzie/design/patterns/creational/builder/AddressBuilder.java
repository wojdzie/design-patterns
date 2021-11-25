package com.github.wojdzie.design.patterns.creational.builder;

public class AddressBuilder {

    private String street;
    private int houseNumber;
    private int apartmentNumber;
    private String postalCode;
    private String city;
    private String country;

    public AddressBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder houseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public AddressBuilder apartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public AddressBuilder postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder country(String country) {
        this.country = country;
        return this;
    }

    public Address build() {
        Address address = new Address();
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setApartmentNumber(apartmentNumber);
        address.setPostalCode(postalCode);
        address.setCity(city);
        address.setCountry(country);

        return address;
    }

    public static void main(String...args) {
        Address address = new AddressBuilder()
                .street("Sesame")
                .houseNumber(1)
                .apartmentNumber(2)
                .postalCode("10-000")
                .city("Los Angeles")
                .country("United States")
                .build();
    }
}
