package org.example.designpatterns.creationaldesignpatterns.prototypepattern.version3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(27);
        prototype.setName("litong");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("游戏");
        hobbies.add("学习");
        prototype.setHobbies(hobbies);

        //拷贝原型对象
        ConcretePrototype cloneType = prototype.deepClone();
        cloneType.getHobbies().add("睡觉");

        System.out.println("prototype = " + prototype);
        System.out.println("cloneType = " + cloneType);

        System.out.println("(prototype == cloneType) = " + (prototype == cloneType));
        System.out.println("(prototype.getHobbies() == cloneType.getHobbies()) = " + (prototype.getHobbies() == cloneType.getHobbies()));

    }
}
