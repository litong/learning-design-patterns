package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.homework;

import java.util.List;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class GrowUpWallDecorator extends NavigationBarDecorator {
    public GrowUpWallDecorator(NavigationBar navigationBar) {
        super(navigationBar);
    }

    @Override
    List<String> getNavigationList() {
        List<String> navigationList = navigationBar.getNavigationList();
        navigationList.add("成长墙");
        return navigationList;
    }
}
