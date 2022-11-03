package org.example.designpatterns.structuraldesignpatterns.bridgepattern.general;

/**
 * @author : litong
 * @since : 11/2/22, Wed
 **/
public class ConcreteImplementorB implements IImplementor {
    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor B");
    }
}
