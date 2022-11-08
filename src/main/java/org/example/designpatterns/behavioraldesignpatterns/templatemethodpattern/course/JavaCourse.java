package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.course;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class JavaCourse extends AbstractCourse {

    private boolean needCheckHomework = false;

    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }

    @Override
    protected boolean needCheckHomework() {
        return needCheckHomework;
    }

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }
}
