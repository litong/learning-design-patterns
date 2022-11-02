package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2.adapters;

import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.ResultMsg;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public interface ILoginAdapter {
    boolean support(Object adapter);
     ResultMsg login(String id, Object adapter);
}
