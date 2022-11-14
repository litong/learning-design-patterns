package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.general;

public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        String request = "B";
        handlerA.handleRequest(request);
    }
}
