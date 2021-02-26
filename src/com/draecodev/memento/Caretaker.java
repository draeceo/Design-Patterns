package com.draecodev.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> states = new ArrayList<>();

    public void push(Memento state) {
        states.add(state);
    }

    public Memento pop() {
        int lastIndex = states.size() - 1;
        Memento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
