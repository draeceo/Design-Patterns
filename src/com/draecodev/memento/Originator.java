package com.draecodev.memento;

public class Originator {
    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createState() {
        return new Memento(value);
    }

    public void restore(Memento state) {
        value = state.getValue();
    }
}
