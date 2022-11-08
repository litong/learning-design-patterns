package org.example.designpatterns.structuraldesignpatterns.facadepattern.points;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class FacadeService {
    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShoppingService shoppingService = new ShoppingService();

    public void exchange(GiftInfo giftInfo) {
        if (qualifyService.isAvailable(giftInfo)) {
            if (paymentService.pay(giftInfo)) {
                String shoppingNo = shoppingService.delivery(giftInfo);
                System.out.println("物流系统下单成功，物流单号是" + shoppingNo);
            }
        }
    }
}
