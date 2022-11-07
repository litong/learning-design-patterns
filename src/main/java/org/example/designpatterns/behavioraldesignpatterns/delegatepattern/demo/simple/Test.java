package org.example.designpatterns.behavioraldesignpatterns.delegatepattern.demo.simple;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("销售", new Leader());
    }
}
