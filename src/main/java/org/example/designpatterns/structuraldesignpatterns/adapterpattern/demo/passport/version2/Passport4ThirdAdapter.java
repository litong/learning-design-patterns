package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2;

import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.ResultMsg;
import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2.adapters.*;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class Passport4ThirdAdapter implements IPassport4Third {
    @Override
    public ResultMsg login4QQ(String openId) {
        return processLogin(openId, Login4QQAdapter.class);
    }

    @Override
    public ResultMsg login4WeChat(String openId) {
        return processLogin(openId, Login4WechatAdapter.class);
    }

    @Override
    public ResultMsg login4Token(String token) {
        return processLogin(token, Login4TokenAdapter.class);
    }

    @Override
    public ResultMsg login4Telephone(String phone, String code) {
        return processLogin(phone, Login4TelephoneAdapter.class);

    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
