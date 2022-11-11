package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.general;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void operationFirst() {
        System.out.println("装饰器A：方法前执行");
    }

    private void operationLast() {
        System.out.println("装饰器A：方法后执行");
    }

    @Override
    void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}
