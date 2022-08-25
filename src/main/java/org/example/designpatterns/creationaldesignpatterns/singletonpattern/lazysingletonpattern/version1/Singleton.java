package org.example.designpatterns.creationaldesignpatterns.singletonpattern.lazysingletonpattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
