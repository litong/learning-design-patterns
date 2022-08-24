package org.example.designpatterns.creationaldesignpatterns.factorymethodpattern.version1;

import org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version1.CourseFactory;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaCourseFactory().create();
        course.record();
    }
}
