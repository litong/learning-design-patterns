package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy;

import java.lang.reflect.Method;

/**
 * @author : litong
 * @since : 9/2/22, Fri
 **/
public interface InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
