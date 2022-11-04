package org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent;

/**
 * 抽象根结点
 *
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("addChild not supported!");
    }
}
