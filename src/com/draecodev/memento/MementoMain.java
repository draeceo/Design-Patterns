package com.draecodev.memento;

public class MementoMain {
    public static void main() {
        Originator input = new Originator();
        Caretaker history = new Caretaker();

        input.setValue("A");
        history.push(input.createState());

        input.setValue("B");
        history.push(input.createState());

        input.setValue("C");
        history.pop();
        input.restore(history.pop());

        System.out.println(input.getValue());
    }
}
