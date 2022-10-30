package org.example.designpatterns.structuraldesignpatterns.proxypattern.version1;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Client {
    public static void main(String[] args) {
        ISubject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
