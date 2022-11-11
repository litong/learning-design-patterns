package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class AliPay implements IPayment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 1000;
    }
}
