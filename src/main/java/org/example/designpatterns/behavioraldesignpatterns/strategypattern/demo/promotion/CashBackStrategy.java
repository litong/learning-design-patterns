package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现至支付宝");
    }
}
