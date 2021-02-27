package com.draecodev.iterator;

public interface Iterator<T> {
    public boolean hasNext();
    public T current();
    public void next();
}
