package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠活动");
    }
}
