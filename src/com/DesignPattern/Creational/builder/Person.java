package com.DesignPattern.Creational.builder;

public class Person {
    // Required parameters
    private final String firstName;
    private final String lastName;

    // Optional parameters
    private final int age;
    private final String address;
    private final String phoneNumber;

    // Private constructor to enforce the use of the Builder
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    // Getters for the parameters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private final String firstName;
        private final String lastName;

        // Optional parameters - initialized to default values
        private int age = 0;
        private String address = "";
        private String phoneNumber = "";

        // Constructor for required parameters
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter methods for optional parameters, returning the Builder itself
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // Build method to create the Person object
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
