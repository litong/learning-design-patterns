package org.example.designpatterns.behavioraldesignpatterns.strategypattern.general;

/**
 * @author : litong
 * @since : 11/11/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        // 选择一个具体的策略
        IStrategy strategy = new ConcreteStrategyA();
        // 创建一个上下文环境
        Context context = new Context(strategy);
        // 客户端直接让上下文环境执行算法
        context.algorithm();
    }
}
