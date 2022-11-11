package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class PromotionStrategyFactory {
    private final static Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<>();
    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.GROUPON, new GrouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashBackStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey) {
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    public static Set<String> getPromotionKeys() {
        return PROMOTIONS.keySet();
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String GROUPON = "GROUPON";
        String CASHBACK = "CASHBACK";
    }
}
