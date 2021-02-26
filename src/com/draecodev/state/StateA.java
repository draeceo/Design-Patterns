package com.draecodev.state;

public class StateA implements State {
    @Override
    public void handle() {
        System.out.println("State A");
    }
}
