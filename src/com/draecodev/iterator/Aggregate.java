package com.draecodev.iterator;

import java.util.ArrayList;
import java.util.List;

public class Aggregate {
    private List<String> values = new ArrayList<>();

    public void push(String value) { values.add(value); }

    public String pop() {
        String lastVal = values.get(values.size() - 1);
        values.remove(values.size() - 1);
        return lastVal;
    }

    public Iterator iterator() {
        return new ConcreteIterator<String>(values);
    }
}
