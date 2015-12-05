package com.arturmkrtchyan.mintds.protocol.response;

import java.util.Optional;

public class NumericResponse<T extends Number> implements Response {
    private T value;


    public NumericResponse(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static Optional<Response> fromString(final String response) {
        try {
            return Optional.of(new NumericResponse<>(Integer.parseInt(response)));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumericResponse<?> that = (NumericResponse<?>) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
