package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

import java.util.Set;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class Test {
    public static void main(String[] args) {

        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();

        System.out.println(promotionKeys);

        String selectKey = "EMPTY";

        IPromotionStrategy strategy = PromotionStrategyFactory.getPromotionStrategy(selectKey);
        strategy.doPromotion();

    }
}
