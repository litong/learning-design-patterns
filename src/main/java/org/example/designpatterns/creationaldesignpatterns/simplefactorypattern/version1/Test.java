package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create("java");
        course.record();
    }
}
