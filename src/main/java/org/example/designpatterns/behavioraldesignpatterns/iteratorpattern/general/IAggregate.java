package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.general;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public interface IAggregate<E> {
    /**
     * 添加元素
     *
     * @param element 要被添加的元素
     * @return 添加元素是否成功
     */
    boolean add(E element);

    /**
     * 移除元素
     *
     * @param element 要被移除的元素
     * @return 是否移除元素成功
     */
    boolean remove(E element);

    /**
     * 获取迭代器
     *
     * @return 迭代器
     */
    Iterator<E> iterator();
}