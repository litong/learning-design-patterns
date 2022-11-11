package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.general;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void operationFirst() {
        System.out.println("装饰器B：方法前执行");
    }

    private void operationLast() {
        System.out.println("装饰器B：方法后执行");
    }

    @Override
    void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}
