package org.example.designpatterns.structuraldesignpatterns.proxypattern.version1;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
