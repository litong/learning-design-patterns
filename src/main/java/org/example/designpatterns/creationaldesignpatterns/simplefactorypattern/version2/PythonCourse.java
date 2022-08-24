package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version2;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
