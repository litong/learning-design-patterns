package org.example.designpatterns.structuraldesignpatterns.bridgepattern.message;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        return null;
    }
}
