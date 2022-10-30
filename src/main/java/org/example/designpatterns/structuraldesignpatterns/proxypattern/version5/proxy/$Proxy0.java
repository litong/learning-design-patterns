package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy;

import org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.client.IPerson;
import java.lang.reflect.*;

public final class $Proxy0 implements org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.client.IPerson {

    InvocationHandler handler;

    public $Proxy0(InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public void findLove() {
        try {
            Method method = org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.client.IPerson.class.getMethod("findLove",new Class[]{});
            this.handler.invoke(this,method,new Object[]{});
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}