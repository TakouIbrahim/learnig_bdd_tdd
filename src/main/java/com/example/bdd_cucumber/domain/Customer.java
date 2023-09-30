package com.example.bdd_cucumber.domain;

public class Customer {
    private final String id;
    private final String firstName;
    private final String lastName;

    public Customer(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
