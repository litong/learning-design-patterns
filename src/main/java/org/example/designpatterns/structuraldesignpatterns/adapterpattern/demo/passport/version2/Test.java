package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.passport.version2;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        IPassport4Third adapter = new Passport4ThirdAdapter();
        adapter.login4QQ("sadfasdgasdf");
    }
}
