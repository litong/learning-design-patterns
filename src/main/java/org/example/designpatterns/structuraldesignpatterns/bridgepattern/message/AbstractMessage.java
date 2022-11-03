package org.example.designpatterns.structuraldesignpatterns.bridgepattern.message;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
