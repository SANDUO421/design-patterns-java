package com.patterns.java.strategy.demo1;

/**
 * 策略A：具体的策略实现---算法实现
 * @author 三多
 * @Time 2020/1/2
 */
public class ConcreteStrategyA implements Strategy {
    public void algorithmInterface() {
        System.out.println("我是策略A");
    }
}
