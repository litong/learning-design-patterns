package org.example.designpatterns.behavioraldesignpatterns.strategypattern.general;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class Context {
    private final IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    void algorithm() {
        this.strategy.algorithm();
    }
}
