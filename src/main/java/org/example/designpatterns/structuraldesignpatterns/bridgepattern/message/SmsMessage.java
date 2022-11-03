package org.example.designpatterns.structuraldesignpatterns.bridgepattern.message;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短息消息发送" + message + "给" + toUser);
    }
}
