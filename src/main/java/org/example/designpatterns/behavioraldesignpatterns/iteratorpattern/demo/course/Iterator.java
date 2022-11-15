package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.demo.course;

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
     * 获取是否存在下一个元素
     *
     * @return 是否存在下一个元素
     */
    boolean hasNext();
}
