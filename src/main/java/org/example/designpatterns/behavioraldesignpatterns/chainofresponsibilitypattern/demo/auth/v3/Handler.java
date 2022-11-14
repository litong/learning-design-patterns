package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v3;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;

public abstract class Handler<T> {

    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (null == this.head) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
