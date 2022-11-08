package org.example.designpatterns.structuraldesignpatterns.facadepattern.points;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class PaymentService {
    public boolean pay(GiftInfo giftInfo) {
        System.out.println("扣减" + giftInfo.getName() + "积分成功");
        return true;
    }
}
