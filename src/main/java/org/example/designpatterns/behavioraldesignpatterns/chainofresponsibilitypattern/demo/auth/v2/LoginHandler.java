package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;

public class LoginHandler extends Handler{
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
