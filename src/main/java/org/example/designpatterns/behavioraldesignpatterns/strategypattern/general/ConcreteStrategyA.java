package org.example.designpatterns.behavioraldesignpatterns.strategypattern.general;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("算法A");
    }
}
