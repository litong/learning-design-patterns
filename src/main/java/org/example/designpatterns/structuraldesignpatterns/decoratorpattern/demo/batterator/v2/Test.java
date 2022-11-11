package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.batterator.v2;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);

        batterCake = new EggDecorator(batterCake);

        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + ", 总价: " + batterCake.getPrice());
    }
}
