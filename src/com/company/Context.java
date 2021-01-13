package com.company;

import com.company.strategies.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        this.strategy.fight();
    }
}
