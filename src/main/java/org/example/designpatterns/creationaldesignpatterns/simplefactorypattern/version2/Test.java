package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version2;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create("org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version2.JavaCourse");
        course.record();
    }
}
