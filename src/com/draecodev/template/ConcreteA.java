package com.draecodev.template;

public class ConcreteA extends Template {
    @Override
    protected void doExecute() {
        System.out.println("Task specific to A");
    }
}
