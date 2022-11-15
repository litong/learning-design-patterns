package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.demo.course;

import java.util.List;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public class IteratorImpl<E> implements Iterator<E> {
    private final List<E> list;
    private int cursor;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置 " + cursor + " : ");
        return list.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }
}
