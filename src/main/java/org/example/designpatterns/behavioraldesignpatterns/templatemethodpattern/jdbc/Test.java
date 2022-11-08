package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc;

import org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
