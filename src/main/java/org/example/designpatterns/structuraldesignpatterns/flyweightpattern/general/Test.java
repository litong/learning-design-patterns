package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.general;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Test {
    public static void main(String[] args) {
        IFlyweight flyweight = FlyweightFactory.getFlyweight("");
        flyweight.operation("");
    }
}
