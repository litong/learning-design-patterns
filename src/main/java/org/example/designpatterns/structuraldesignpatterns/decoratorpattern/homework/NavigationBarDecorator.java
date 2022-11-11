package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.homework;

import org.springframework.util.Assert;

/**
 * @author : litong
 * @since : 11/10/22, Thu
 **/
public abstract class NavigationBarDecorator extends NavigationBar {

    protected final NavigationBar navigationBar;

    public NavigationBarDecorator(NavigationBar navigationBar) {
        Assert.notNull(navigationBar, "NavigationBar can't be null");
        this.navigationBar = navigationBar;
    }
}
