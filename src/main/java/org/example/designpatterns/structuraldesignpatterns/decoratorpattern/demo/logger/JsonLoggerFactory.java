package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class clazz) {
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
