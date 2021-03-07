package com.draecodev.observer;

public class ObserverMain {
    public static void main() {
        ConcreteSubject subject = new ConcreteSubject();

        Observer obsA = new ConcreteObserver();
        Observer obsB = new ConcreteObserver();

        subject.attach(obsA);
        subject.attach(obsB);

        subject.setValue(5);

        subject.detach(obsB);

        subject.setValue(1);
    }
}
