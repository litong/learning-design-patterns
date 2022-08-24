package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version3;

import java.util.Calendar;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create(JavaCourse.class);
        course.record();
    }
}
