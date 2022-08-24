package org.example.designpatterns.creationaldesignpatterns.abstractfactorypattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class PythonCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("Python课程录制");
    }
}
