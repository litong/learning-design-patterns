package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.classadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter();
        adapter.output5V();
    }
}
