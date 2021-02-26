package com.draecodev.memento;

public class Memento {
    private final String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
