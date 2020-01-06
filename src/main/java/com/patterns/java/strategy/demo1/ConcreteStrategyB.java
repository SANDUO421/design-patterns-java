package com.patterns.java.strategy.demo1;

/**
 * 策略B：具体的策略实现---算法实现
 * @author 三多
 * @Time 2020/1/2
 */
public class ConcreteStrategyB implements Strategy {
    public void algorithmInterface() {
        System.out.println("我是策略B");
    }
}
