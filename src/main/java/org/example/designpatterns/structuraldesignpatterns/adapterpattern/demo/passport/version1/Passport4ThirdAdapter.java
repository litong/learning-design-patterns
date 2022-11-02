package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version1;

import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.PassportService;
import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.ResultMsg;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class Passport4ThirdAdapter extends PassportService implements IPassport4Third {
    @Override
    public ResultMsg login4QQ(String openId) {
        return login4Register(openId, null);
    }

    @Override
    public ResultMsg login4WeChat(String openId) {
        return login4Register(openId, null);
    }

    @Override
    public ResultMsg login4Token(String token) {
        return login4Register(token, null);
    }

    @Override
    public ResultMsg login4Telephone(String phone, String code) {
        return login4Register(phone, null);

    }

    private ResultMsg login4Register(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
