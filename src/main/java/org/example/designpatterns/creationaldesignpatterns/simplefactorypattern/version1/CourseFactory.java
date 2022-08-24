package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class CourseFactory {
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }
}
