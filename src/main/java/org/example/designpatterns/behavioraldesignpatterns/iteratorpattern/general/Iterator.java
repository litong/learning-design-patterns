package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.general;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public interface Iterator<E> {

    /**
     * 获取下一个元素
     *
     * @return 下一个元素
     */
    E next();

    /**
     * 是否存在下一个节点
     *
     * @return 是否存在下一个节点
     */
    boolean hasNext();
}