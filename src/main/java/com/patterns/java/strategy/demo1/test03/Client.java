package com.patterns.java.strategy.demo1.test03;

/**
 * 策略模式+ 模板方法模式
 * @author 三多
 * @Time 2020/1/6
 */
public class Client {
    public static void main(String[] args) {
        LogContext logContext = new LogContext();
        logContext.log("记录日志");
        logContext.log("多记录一点日志");
    }
}
