package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v3;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;

public class MemberService {
    public void login(String loginName, String loginPass) {

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());



        builder.build().doHandler(new Member(loginName, loginPass));
    }
}
