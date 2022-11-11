package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.general;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class Client {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();
        Decorator decoratorB = new ConcreteDecoratorB(c1);
        decoratorB.operation();
        Decorator decoratorAandB = new ConcreteDecoratorA(decoratorB);
        decoratorAandB.operation();
    }
}
