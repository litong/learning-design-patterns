package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.general;

/**
 * 具体享元角色
 *
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class ConcreteFlyweight implements IFlyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + this.intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
