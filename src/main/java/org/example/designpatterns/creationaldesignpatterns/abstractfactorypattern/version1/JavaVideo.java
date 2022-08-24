package org.example.designpatterns.creationaldesignpatterns.abstractfactorypattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
