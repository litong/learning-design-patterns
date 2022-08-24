package org.example.designpatterns.creationaldesignpatterns.factorymethodpattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
