package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class UnionPay implements IPayment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 2000;
    }
}
