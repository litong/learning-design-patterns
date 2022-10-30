package org.example.designpatterns.structuraldesignpatterns.proxypattern.version1;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }


    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("called before request().");
    }

    private void after() {
        System.out.println("called after request().");
    }
}
