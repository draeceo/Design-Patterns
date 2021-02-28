package com.draecodev.strategy;

public class StrategyMain {
    public static void main() {
        Context context = new Context();
        StrategyA strategyA = new StrategyA();
        StrategyB strategyB = new StrategyB();

        context.setAlgorithmStrategy(strategyA);
        context.apply();

        context.setAlgorithmStrategy(strategyB);
        context.apply();

        /*
         * Unlike the state pattern, which is mean to modify the complete context behavior based
         * on the current state, the strategy pattern simply allows for the context object to
         * utilize multiple different implementations for solving various problems, all sharing
         * a common interface. A context object can consist of multiple strategy objects for
         * completing different tasks, whereas in the state pattern a context object generally
         * has just one state object to perform all respective tasks.
         */
    }
}
