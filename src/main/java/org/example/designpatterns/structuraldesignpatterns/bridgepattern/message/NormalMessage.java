package org.example.designpatterns.structuraldesignpatterns.bridgepattern.message;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class NormalMessage extends AbstractMessage {
    public NormalMessage(IMessage message) {
        super(message);
    }
}
