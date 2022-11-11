package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class GrouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购优惠");
    }
}
