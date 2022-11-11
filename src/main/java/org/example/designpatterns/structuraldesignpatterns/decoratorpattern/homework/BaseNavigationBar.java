package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class BaseNavigationBar extends NavigationBar {
    @Override
    List<String> getNavigationList() {
        List<String> navigationList = new ArrayList<>();
        navigationList.add("问答");
        navigationList.add("文章");
        navigationList.add("精品课");
        navigationList.add("冒泡");
        navigationList.add("商城");
        return navigationList;
    }
}
