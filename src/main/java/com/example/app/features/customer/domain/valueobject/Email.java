package com.example.app.features.customer.domain.valueobject;

import java.util.Objects;
import java.util.regex.Pattern;

public final class Email {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile(
                    "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
            );

    private final String value;

    public Email(String value) {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "Email não pode ser vazio"
            );
        }

        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException(
                    "Email inválido"
            );
        }

        this.value = value;
    }

     public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }

        if (!(o instanceof Email email)) {
            return false;
        }

        return value.equals(email.value);
    }

     @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
