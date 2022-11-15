package org.example.designpatterns.behavioraldesignpatterns.iteratorpattern.demo.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 11/14/22, Mon
 **/
public class CourseAggregateImpl implements ICourseAggregate {
    private final List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(courseList);
    }
}
