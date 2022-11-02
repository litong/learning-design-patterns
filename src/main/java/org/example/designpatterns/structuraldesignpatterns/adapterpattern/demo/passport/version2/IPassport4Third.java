package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2;

import org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.ResultMsg;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public interface IPassport4Third {
    /**
     * 通过QQ登陆
     *
     * @param openId
     * @return
     */
    ResultMsg login4QQ(String openId);

    /**
     * 通过微信登陆
     *
     * @param openId
     * @return
     */
    ResultMsg login4WeChat(String openId);

    /**
     * 通过Token登陆
     *
     * @param token
     * @return
     */
    ResultMsg login4Token(String token);

    /**
     * 通过手机号登陆
     *
     * @param phone
     * @return
     */
    ResultMsg login4Telephone(String phone, String code);


}
