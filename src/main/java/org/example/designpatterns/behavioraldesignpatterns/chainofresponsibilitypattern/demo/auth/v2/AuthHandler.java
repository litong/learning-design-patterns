package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;

public class AuthHandler extends Handler{
    @Override
    public void doHandler(Member member) {
        // 判断用户角色是否为管理员
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，无权限操作！");
        }
        System.out.println("允许操作！");
    }
}
