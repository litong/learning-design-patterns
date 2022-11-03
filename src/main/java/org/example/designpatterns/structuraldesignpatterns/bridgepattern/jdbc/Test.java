package org.example.designpatterns.structuraldesignpatterns.bridgepattern.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Test {
    public static void main(String[] args) {
        try {
            // 1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接Connection
            // 主机: 端口号/数据库名
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
            // 3. 得到执行 sql 语句的 Statement 对象
            Statement stmt = conn.createStatement();
            // 4. 执行 sql 语句，并返回结果
            ResultSet rs = stmt.executeQuery("select * from table ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
