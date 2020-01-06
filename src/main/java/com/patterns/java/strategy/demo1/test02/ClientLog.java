package com.patterns.java.strategy.demo1.test02;

/**
 * @author 三多
 * @Time 2020/1/2
 */
public class ClientLog {
    public static void main(String[] args) {
        LogContext logContext = new LogContext();
        logContext.log("记录日志");
        logContext.log("多记录一点日志");
    }
}
