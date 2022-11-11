package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class CouponStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
