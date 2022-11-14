package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v1;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;
import org.springframework.util.StringUtils;

public class MemberService {
    public void login(String loginName, String loginPass) {
        // 判断用户名密码是否为空
        if (!(StringUtils.hasText(loginName) && StringUtils.hasText(loginPass))) {
            System.out.println("用户名密码不能为空！");
            return;
        }
        System.out.println("用户名密码不为空，继续执行……");

        // 判断用户名密码是否正确
        Member member = checkExists(loginName, loginPass);
        if (null == member) {
            System.out.println("用户名密码错误");
            return;
        }
        System.out.println("登录成功！");

        // 判断用户角色是否为管理员
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，无权限操作！");
        }
        System.out.println("允许操作！");
    }

    private Member checkExists(String loginName, String loginPass) {
        Member member = new Member(loginName, loginPass);
        member.setRoleName("管理员");
        return member;
    }
}
