package org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.v2;

import org.example.designpatterns.behavioraldesignpatterns.chainofresponsibilitypattern.demo.auth.Member;
import org.springframework.util.StringUtils;

public class MemberService {
    public void login(String loginName, String loginPass) {

        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName, loginPass));
    }
}
