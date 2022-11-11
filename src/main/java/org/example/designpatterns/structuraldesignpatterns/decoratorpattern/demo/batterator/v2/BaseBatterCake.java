package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.batterator.v2;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class BaseBatterCake extends BatterCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
