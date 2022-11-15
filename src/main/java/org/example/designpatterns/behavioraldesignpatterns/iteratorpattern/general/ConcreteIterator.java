package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.general;

import java.util.List;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public class ConcreteIterator<E> implements Iterator<E> {
    private final List<E> list;
    private int cursor = 0;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }


    @Override
    public E next() {
        return this.list.get(this.cursor++);
    }


    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }
}