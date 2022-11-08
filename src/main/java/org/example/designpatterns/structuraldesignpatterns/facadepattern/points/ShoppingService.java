package org.example.designpatterns.structuraldesignpatterns.facadepattern.points;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class ShoppingService {
    public String delivery(GiftInfo giftInfo) {
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shoppingNo = "666";
        return shoppingNo;
    }
}
