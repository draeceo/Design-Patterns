package com.draecodev.strategy;

public class Context {
    private Strategy algorithmStrategy;

    public void apply() {
        algorithmStrategy.algorithm();
    }

    public void setAlgorithmStrategy(Strategy algorithmStrategy) {
        this.algorithmStrategy = algorithmStrategy;
    }
}
