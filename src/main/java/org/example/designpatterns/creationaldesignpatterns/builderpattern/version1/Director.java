package org.example.designpatterns.creationaldesignpatterns.builderpattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class Director {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());
    }
}
