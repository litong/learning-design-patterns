package org.example.designpatterns.creationaldesignpatterns.singletonpattern.hungrysingletonpattern.version2;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class StaticSingleton {
    public static final StaticSingleton INSTANCE;

    static {
        INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return INSTANCE;
    }
}
