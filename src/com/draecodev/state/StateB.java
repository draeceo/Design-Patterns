package com.draecodev.state;

public class StateB implements State {
    @Override
    public void handle() {
        System.out.println("State B");
    }
}
