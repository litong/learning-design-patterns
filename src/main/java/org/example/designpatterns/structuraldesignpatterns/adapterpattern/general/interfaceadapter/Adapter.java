package org.example.designpatterns.structuraldesignpatterns.adapterpattern.general.interfaceadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public abstract class Adapter implements Target {

    protected Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public int request1() {
        return 0;
    }

    @Override
    public int request2() {
        return 0;
    }

    @Override
    public int request3() {
        return 0;
    }

    @Override
    public int request4() {
        return 0;
    }
}
