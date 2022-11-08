package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.general;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMethod();
        abc = new ConcreteClassB();
        abc.templateMethod();
    }
}
