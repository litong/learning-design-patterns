package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.interfaceadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
