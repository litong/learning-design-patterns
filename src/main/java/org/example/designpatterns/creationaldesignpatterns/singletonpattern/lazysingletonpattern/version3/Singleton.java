package org.example.designpatterns.creationaldesignpatterns.singletonpattern.lazysingletonpattern.version3;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 检查是否要阻塞
        if (instance == null) {
            synchronized (Singleton.class) {
                // 检查是否要创建实例
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
