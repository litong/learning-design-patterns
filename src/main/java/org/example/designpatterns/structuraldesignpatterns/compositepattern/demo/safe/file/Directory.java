package org.example.designpatterns.structuraldesignpatterns.compositepattern.demo.safe.file;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public abstract class Directory {
    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    abstract void show();
}
