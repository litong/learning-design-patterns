package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.general;

import org.springframework.util.Assert;

import java.util.Objects;

public class ConcreteHandlerB extends Handler{
    @Override
    void handleRequest(String request) {
        if (!"B".equals(request)) {
            Assert.notNull(this.getNextHandler(), "没有可执行的Handle");
            System.out.println("B：无法处理请求"+ request + "，正在迭代……");
            this.getNextHandler().handleRequest(request);
            return;
        }
        System.out.println("B：正在处理请求"+request);
    }
}
