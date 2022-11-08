package org.example.designpatterns.structuraldesignpatterns.facadepattern.general;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
