package com.draecodev.template;

public abstract class Template {
    public void execute() {
        System.out.println("Routine task");
        doExecute();
    }

    protected abstract void doExecute();

    /*
     * The Template class allows for the implementation of some routine task for each subclass,
     * while specifying a separate 'doExecute()' method for each subclass' unique behaviors.
     */
}
