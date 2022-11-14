package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;

public abstract class Handler {

    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
