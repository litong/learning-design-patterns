package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.pool;

import java.sql.Connection;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println(conn);
    }
}
