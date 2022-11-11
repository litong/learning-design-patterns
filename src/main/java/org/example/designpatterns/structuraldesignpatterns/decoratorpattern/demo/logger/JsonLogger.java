package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class JsonLogger extends LoggerDecorator {
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void error(String s) {
        JSONObject result = new JSONObject();
        result.put("massage", s);
        logger.error(result.toString());
    }

    @Override
    public void warn(String s) {
        JSONObject result = new JSONObject();
        result.put("massage", s);
        logger.warn(result.toString());
    }

    @Override
    public void info(String s) {
        JSONObject result = new JSONObject();
        result.put("massage", s);
        logger.info(result.toString());
    }

    @Override
    public void debug(String s) {
        JSONObject result = new JSONObject();
        result.put("massage", s);
        logger.debug(result.toString());
    }

    @Override
    public void trace(String s) {
        JSONObject result = new JSONObject();
        result.put("massage", s);
        logger.trace(result.toString());
    }

    @Override
    public void error(String s, Throwable throwable) {
        super.error(s, throwable);
    }

    public void error(Exception e) {
        JSONObject result = newJsonObject();
        result.put("exception", e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        result.put("stackTrace", trace);
        logger.error(result.toString());
    }

    private JSONObject newJsonObject() {
        return new JSONObject();
    }
}
