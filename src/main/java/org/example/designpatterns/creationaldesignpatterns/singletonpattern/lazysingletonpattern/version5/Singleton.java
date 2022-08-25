package org.example.designpatterns.creationaldesignpatterns.singletonpattern.lazysingletonpattern.version5;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private Singleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
