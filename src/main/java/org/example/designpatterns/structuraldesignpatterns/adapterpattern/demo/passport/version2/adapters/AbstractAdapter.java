package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2.adapters;

import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.PassportService;
import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.ResultMsg;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {
    private ResultMsg login4Register(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
