package com.patterns.java.strategy.demo1.test02;

/**
 * 日志容错
 *
 * @author 三多
 * @Time 2020/1/2
 */
public interface LogStrategy {
    /**
     * 记录日志
     * @param msg
     */
    public void log(String msg);
}
