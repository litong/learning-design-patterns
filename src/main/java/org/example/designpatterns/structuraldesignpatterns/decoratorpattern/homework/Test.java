package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.homework;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        NavigationBar navigationBar = new BaseNavigationBar();
        navigationBar.show();
        navigationBar = new HomeworkDecorator(navigationBar);
        navigationBar = new QuestionBankDecorator(navigationBar);
        navigationBar = new GrowUpWallDecorator(navigationBar);
        navigationBar.show();
    }
}
