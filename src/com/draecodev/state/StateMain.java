package com.draecodev.state;

public class StateMain {
    public static void main() {
        Context context = new Context();

        context.setState(new StateA());
        context.request();

        context.setState(new StateB());
        context.request();
    }
}
