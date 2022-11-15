package org.example.designpatterns.behavioraldesignpatterns.commandpattren.general;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class Invoker {
    ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    void action() {
        command.execute();
    }
}
