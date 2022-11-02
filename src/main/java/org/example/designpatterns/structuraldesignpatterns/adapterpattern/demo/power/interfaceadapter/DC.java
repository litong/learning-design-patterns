package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.interfaceadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public interface DC {
    int output5V();
    int output12V();
    int output24V();
    int output36V();
}
