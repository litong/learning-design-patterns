package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2;

public class Test {
    public static void main(String[] args) {
        String loginName = "laoli";
        String loginPass = "laoli";

        MemberService memberService = new MemberService();
        memberService.login(loginName, loginPass);
    }
}
