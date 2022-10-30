package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.client;

import org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy.ClassLoader;
import org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy.InvocationHandler;
import org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author : litong
 * @since : 9/2/22, Fri
 **/
public class Meipo implements InvocationHandler {
    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(new ClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }

    private void after() {
        System.out.println("双方同意，开始交往。");
    }
}
