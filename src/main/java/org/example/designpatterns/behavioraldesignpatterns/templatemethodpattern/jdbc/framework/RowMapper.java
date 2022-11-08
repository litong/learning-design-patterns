package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.jdbc.framework;

import java.sql.ResultSet;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
