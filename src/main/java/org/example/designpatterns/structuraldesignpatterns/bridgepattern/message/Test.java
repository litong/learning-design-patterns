package org.example.designpatterns.structuraldesignpatterns.bridgepattern.message;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请", "王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请", "王总");
    }
}
