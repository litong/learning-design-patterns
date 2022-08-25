package org.example.designpatterns.creationaldesignpatterns.singletonpattern.hungrysingletonpattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
