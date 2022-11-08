package org.example.designpatterns.structuraldesignpatterns.facadepattern.points;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class Test {
    public static void main(String[] args) {

        FacadeService facadeService = new FacadeService();

        GiftInfo giftInfo = new GiftInfo("《Spring 核心原理》");

        facadeService.exchange(giftInfo);
    }
}
