package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay;

import org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport.IPayment;
import org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport.MsgResult;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class Order {
    private String uid;
    private String oid;
    private double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        IPayment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额" + amount + "，开始扣款...");
        return payment.pay(uid, amount);

    }
}
