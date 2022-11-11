package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.homework;

import java.util.List;

/**
 * @author : litong
 * @since : 11/10/22, Thu
 **/
public abstract class NavigationBar {
    /**
     * 获取导航列表
     *
     * @return 导航列表
     */
    abstract List<String> getNavigationList();

    void show() {
        List<String> navigationList = this.getNavigationList();
        System.out.println("导航栏：");
        for (String navigation : navigationList) {
            System.out.println(navigation);
        }

    }
}
