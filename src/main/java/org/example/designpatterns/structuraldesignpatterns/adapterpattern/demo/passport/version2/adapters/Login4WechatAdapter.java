package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2.adapters;

import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.ResultMsg;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class Login4WechatAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof Login4WechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
