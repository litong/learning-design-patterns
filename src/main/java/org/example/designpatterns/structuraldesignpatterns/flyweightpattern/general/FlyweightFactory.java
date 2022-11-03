package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.general;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class FlyweightFactory {
    private static Map<String, IFlyweight> pool = new HashMap<>();

    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
