package com.draecodev.iterator;

public class IteratorMain {
    public static void main() {
        Aggregate aggregate = new Aggregate();

        aggregate.push("a");
        aggregate.push("b");
        aggregate.push("c");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

    }
}
