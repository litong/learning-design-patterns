package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version3;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz) {

        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
