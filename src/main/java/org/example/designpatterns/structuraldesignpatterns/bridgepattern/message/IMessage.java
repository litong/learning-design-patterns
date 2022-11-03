package org.example.designpatterns.structuraldesignpatterns.bridgepattern.message;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public interface IMessage {
    /**
     * 发送消息
     *
     * @param message 消息内容
     * @param toUser  消息接受者
     */
    void send(String message, String toUser);
}
