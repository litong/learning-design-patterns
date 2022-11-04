package org.example.designpatterns.structuraldesignpatterns.compositepattern.demo.safe.file;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class File extends Directory {
    public File(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(this.name);
    }
}
