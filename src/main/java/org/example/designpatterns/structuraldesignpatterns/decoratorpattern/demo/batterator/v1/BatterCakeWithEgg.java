package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.batterator.v1;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+ 1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
