package org.example.designpatterns.behavioraldesignpatterns.strategypattern.demo.pay;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1", "202211110001", 500);
        System.out.println(order.pay(PayStrategy.JD_PAY).getMessage());
    }
}
