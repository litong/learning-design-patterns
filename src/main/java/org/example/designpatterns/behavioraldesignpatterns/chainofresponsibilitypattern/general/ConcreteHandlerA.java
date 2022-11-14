package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.general;

import org.springframework.util.Assert;

public class ConcreteHandlerA extends Handler{
    @Override
    void handleRequest(String request) {
        if (!"A".equals(request)) {
            Assert.notNull(this.getNextHandler(), "没有可执行的Handle");
            System.out.println("A：无法处理请求"+ request + "，正在迭代……");
            this.getNextHandler().handleRequest(request);
            return;
        }
        System.out.println("A：正在处理请求: "+ request);
    }
}
