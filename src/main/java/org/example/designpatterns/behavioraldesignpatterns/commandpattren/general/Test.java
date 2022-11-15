package org.example.designpatterns.behavioraldesignpatterns.commandpattren.general;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
