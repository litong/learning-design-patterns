package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.demo.course;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public interface ICourseAggregate {
    /**
     * 添加课程
     *
     * @param course 课程
     */
    void add(Course course);

    /**
     * 移除课程
     *
     * @param course 课程
     */
    void remove(Course course);

    /**
     * 获取课程迭代器
     *
     * @return 迭代器
     */
    Iterator<Course> iterator();
}
