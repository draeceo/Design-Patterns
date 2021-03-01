package com.draecodev.template;

public class ConcreteB extends Template {
    @Override
    protected void doExecute() {
        System.out.println("Task specific to B");
    }
}
