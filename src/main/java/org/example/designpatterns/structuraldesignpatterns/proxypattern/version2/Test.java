package org.example.designpatterns.structuraldesignpatterns.proxypattern.version2;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        Zhanglaosan zhanglaosan = new Zhanglaosan(new Zhangsan());
        zhanglaosan.findLove();
    }
}
