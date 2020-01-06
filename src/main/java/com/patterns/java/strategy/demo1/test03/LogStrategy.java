package com.patterns.java.strategy.demo1.test03;

/**
 * 日志记录接口
 *
 * @author 三多
 * @Time 2020/1/6
 */
public interface LogStrategy {
    /**
     * 记录日志
     * @param name
     */
    public void log(String name);
}
