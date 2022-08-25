package org.example.designpatterns.creationaldesignpatterns.singletonpattern.registersingletonpattern.version2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Singleton {
    private Singleton(){

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        if (!ioc.containsKey(className)) {
            Object instance = null;
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className, instance);
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return instance;
        } else {
            return ioc.get(className);
        }
    }
}
