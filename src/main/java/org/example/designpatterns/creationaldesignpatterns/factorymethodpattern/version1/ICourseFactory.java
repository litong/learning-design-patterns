package org.example.designpatterns.creationaldesignpatterns.factorymethodpattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public interface ICourseFactory {
    /**
     * 创建课程
     *
     * @return 课程
     */
    ICourse create();
}
