package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.batterator.v2;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
