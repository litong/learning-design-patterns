package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay;

import org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WE_PAY = "WePay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, IPayment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(JD_PAY, new JdPay());
        payStrategy.put(WE_PAY, new WePay());
        payStrategy.put(UNION_PAY, new UnionPay());
    }

    public static IPayment get(String payKey) {
        if (payStrategy.containsKey(payKey)) {
            return payStrategy.get(payKey);
        }
        return payStrategy.get(DEFAULT_PAY);
    }
}
