package org.example.designpatterns.creationaldesignpatterns.singletonpattern.lazysingletonpattern.version4;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private Singleton() {

    }

    private static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
