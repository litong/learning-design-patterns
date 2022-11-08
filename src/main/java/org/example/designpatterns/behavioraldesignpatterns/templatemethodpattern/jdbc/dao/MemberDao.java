package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc.dao;

import org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc.entity.Member;
import org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc.framework.JdbcTemplate;
import org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc.framework.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                // 字段太多原型模式
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
    }
}
