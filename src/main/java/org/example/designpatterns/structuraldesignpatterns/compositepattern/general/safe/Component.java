package org.example.designpatterns.structuraldesignpatterns.compositepattern.general.safe;

/**
 * 抽象根结点
 *
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

}
