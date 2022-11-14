package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v1;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2.MemberService;

public class Test {
    public static void main(String[] args) {
        String loginName = "laoli";
        String loginPass = "laoli";

        org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2.MemberService memberService = new MemberService();
        memberService.login(loginName, loginPass);
    }
}
