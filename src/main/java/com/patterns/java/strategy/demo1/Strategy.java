package com.patterns.java.strategy.demo1;

/**
 * 策略接口：约束一系列具体的策略算法
 * Context上下问通过这个接口调用对应的具体算法
 *
 * @author 三多
 * @Time 2020/1/2
 */
public interface Strategy {
    /**
     * 算法接口
     */
    public void algorithmInterface();
}
