package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.client;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美，大长腿");
    }
}
