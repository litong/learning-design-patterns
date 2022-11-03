package org.example.designpatterns.structuraldesignpatterns.bridgepattern.general;

/**
 * @author : litong
 * @since : 11/2/22, Wed
 **/
public class Test {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
    }
}
