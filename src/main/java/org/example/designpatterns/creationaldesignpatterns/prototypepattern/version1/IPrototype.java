package org.example.designpatterns.creationaldesignpatterns.prototypepattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public interface IPrototype<T> {
    /**
     * 拷贝
     *
     * @return 拷贝对象
     */
    T clone();
}
