package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class PromotionActivity {
    private final IPromotionStrategy promotionStrategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }
}
