package org.example.designpatterns.creationaldesignpatterns.singletonpattern.threadlocalsingletonpattern;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private static final ThreadLocal<Singleton> threadLocalInstance = new ThreadLocal<Singleton>() {
        @Override
        protected Singleton initialValue() {
            return new Singleton();
        }
    };

    private Singleton() {
    }

    public static Singleton getInstance() {
        return threadLocalInstance.get();
    }
}
