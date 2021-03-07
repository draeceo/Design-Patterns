package com.draecodev.command;

public class CommandMain {
    public static void main() {
        Receiver receiver = new Receiver();
        Command command = new CommandA(receiver);
        Invoker invoker = new Invoker(command);

        invoker.run();
    }
}
