package org.example.designpatterns.creationaldesignpatterns.prototypepattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        System.out.println("prototype = " + prototype);

        //拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        System.out.println("cloneType = " + cloneType);
    }
}
