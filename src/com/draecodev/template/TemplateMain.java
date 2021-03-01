package com.draecodev.template;

public class TemplateMain {
    public static void main() {
        ConcreteA concreteA = new ConcreteA();
        ConcreteB concreteB = new ConcreteB();

        concreteA.execute();
        concreteB.execute();
    }
}
