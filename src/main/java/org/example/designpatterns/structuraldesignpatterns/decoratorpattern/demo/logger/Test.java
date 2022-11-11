package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class Test {

//    private static final Logger logger = LoggerFactory.getLogger(Test.class);
    private static final Logger logger = JsonLoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.error("系统错误");
    }
}
