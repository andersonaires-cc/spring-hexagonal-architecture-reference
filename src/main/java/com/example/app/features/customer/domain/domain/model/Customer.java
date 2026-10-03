package com.example.app.features.customer.domain.domain.model;

import java.util.UUID;

import com.example.app.features.customer.domain.domain.valueobject.Email;

public class Customer {
    
    private final UUID id;
    private String name;
    private Email email;

    public Customer
    (
        UUID id,
        String name,
        Email email
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static Customer create(
            String name,
            Email email
    ) {
        return new Customer(
                UUID.randomUUID(),
                name,
                email
        );
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeEmail(Email email) {
        this.email = email;
    }
}
