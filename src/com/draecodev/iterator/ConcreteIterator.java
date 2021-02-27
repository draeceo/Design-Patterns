package com.draecodev.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    private int currentIndex = 0;

    ConcreteIterator(List list) { this.list = list; }

    @Override
    public boolean hasNext() {
        return list.size() > currentIndex;
    }

    @Override
    public T current() {
        return list.get(currentIndex);
    }

    @Override
    public void next() {
        currentIndex++;
    }
}
