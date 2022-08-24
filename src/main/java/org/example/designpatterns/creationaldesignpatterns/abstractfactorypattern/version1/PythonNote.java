package org.example.designpatterns.creationaldesignpatterns.abstractfactorypattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
