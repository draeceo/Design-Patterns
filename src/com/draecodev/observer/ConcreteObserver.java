package com.draecodev.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Object value) {
        System.out.println("Value updated: " + value);
    }
}
