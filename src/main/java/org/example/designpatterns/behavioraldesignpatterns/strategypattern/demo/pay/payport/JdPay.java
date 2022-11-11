package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class JdPay implements IPayment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 200;
    }
}
