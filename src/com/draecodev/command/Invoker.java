package com.draecodev.command;

public class Invoker {
    private final Command command;

    Invoker(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
