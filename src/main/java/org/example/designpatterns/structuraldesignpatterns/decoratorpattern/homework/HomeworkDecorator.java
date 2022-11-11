package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.homework;

import java.util.List;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class HomeworkDecorator extends NavigationBarDecorator {
    public HomeworkDecorator(NavigationBar navigationBar) {
        super(navigationBar);
    }

    @Override
    List<String> getNavigationList() {
        List<String> navigationList = navigationBar.getNavigationList();
        navigationList.add("作业");
        return navigationList;
    }
}
