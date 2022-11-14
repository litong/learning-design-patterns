package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v3;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;
import org.springframework.util.StringUtils;

public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if (!(StringUtils.hasText(member.getLoginName()) && StringUtils.hasText(member.getLoginPass()))) {
            System.out.println("用户名密码不能为空！");
            return;
        }
        System.out.println("用户名密码不为空，继续执行……");
        next.doHandler(member);
    }
}
