package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public class ConcreteAggregate<E> implements IAggregate<E> {
    private final List<E> list = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return this.list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return this.list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(this.list);
    }
}