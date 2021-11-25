package com.github.wojdzie.design.patterns.creational.builder;

public class Person {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private static class PersonBuilder {

        private final Person person = new Person();

        public PersonBuilder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    public static void main(String...args) {
        Person person = new Person.PersonBuilder()
                .firstName("John")
                .lastName("Doe")
                .build();
    }
}
