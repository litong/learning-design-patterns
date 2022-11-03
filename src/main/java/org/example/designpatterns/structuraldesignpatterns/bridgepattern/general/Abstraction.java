package org.example.designpatterns.structuraldesignpatterns.bridgepattern.general;

/**
 * @author : litong
 * @since : 11/2/22, Wed
 **/
public class Abstraction {
    protected IImplementor mImplementor;

    public Abstraction(IImplementor implementor) {
        this.mImplementor = implementor;
    }

    public void operation() {
        this.mImplementor.operationImpl();
    }
}
