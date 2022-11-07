package org.example.designpatterns.behavioraldesignpatterns.delegatepattern.demo.simple;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Boss {
    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
