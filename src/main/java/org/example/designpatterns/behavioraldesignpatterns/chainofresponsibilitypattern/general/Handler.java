package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.general;

public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected Handler getNextHandler() {
        return nextHandler;
    }

    abstract void handleRequest(String request);
}
