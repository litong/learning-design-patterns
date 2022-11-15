package org.example.designpatterns.behavioraldesignpatterns.commandpattren.general;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class ConcreteCommand implements ICommand {

    Receiver receiver = new Receiver();

    @Override
    public void execute() {
        System.out.println("已发送指令，等待执行");
        receiver.action();
    }
}
