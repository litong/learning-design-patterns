package org.example.designpatterns.structuraldesignpatterns.proxypattern.version4;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = (Zhangsan) new Meipo().getInstance(Zhangsan.class);
        zhangsan.findLove();

        Zhaoliu zhaoliu = (Zhaoliu) new Meipo().getInstance(Zhaoliu.class);
        zhaoliu.findLove();
    }
}
