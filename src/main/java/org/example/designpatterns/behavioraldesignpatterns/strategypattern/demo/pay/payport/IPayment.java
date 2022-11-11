package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay.payport;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public interface IPayment {

    String getName();

    default MsgResult pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额：" + amount);
    }

    double queryBalance(String uid);
}
