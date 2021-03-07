package com.draecodev.observer;

public class ConcreteSubject extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        super.notifyObservers(value);
    }
}
