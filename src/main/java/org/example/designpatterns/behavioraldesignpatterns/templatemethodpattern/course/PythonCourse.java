package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.course;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class PythonCourse extends AbstractCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
