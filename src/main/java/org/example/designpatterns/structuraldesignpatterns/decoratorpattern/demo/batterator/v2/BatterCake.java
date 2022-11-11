package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.batterator.v2;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public abstract class BatterCake {
    /**
     * 获取名称
     *
     * @return 名称
     */
    protected abstract String getMsg();

    /**
     * 获取价格
     *
     * @return 价格
     */
    public abstract int getPrice();
}
