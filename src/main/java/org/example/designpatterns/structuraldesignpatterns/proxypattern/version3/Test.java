package org.example.designpatterns.structuraldesignpatterns.proxypattern.version3;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        Meipo meipo = new Meipo();
        IPerson zhangsan = meipo.getInstance(new Zhangsan());
        zhangsan.findLove();

        IPerson zhaoliu = meipo.getInstance(new Zhaoliu());
        zhaoliu.findLove();
    }
}
