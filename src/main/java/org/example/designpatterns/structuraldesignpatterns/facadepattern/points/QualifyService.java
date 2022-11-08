package org.example.designpatterns.structuraldesignpatterns.facadepattern.points;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class QualifyService {
    public boolean isAvailable(GiftInfo giftInfo) {
        System.out.println("校验" + giftInfo.getName() + "积分通过，库存通过");
        return true;
    }
}
