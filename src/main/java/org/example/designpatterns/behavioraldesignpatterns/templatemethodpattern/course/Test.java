package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.course;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class Test {
    public static void main(String[] args) {

        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(true);
        javaCourse.createCourse();

        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
