package org.example.designpatterns.creationaldesignpatterns.simplefactorypattern.version2;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class CourseFactory {
    public ICourse create(String className) {
        if (!(null == className || className.length() == 0)) {
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
