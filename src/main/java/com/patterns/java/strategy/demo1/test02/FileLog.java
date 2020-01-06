package com.patterns.java.strategy.demo1.test02;

/**
 * @author 三多
 * @Time 2020/1/2
 */
public class FileLog implements LogStrategy {
    /**
     * 记录日志-文件
     *
     * @param msg
     */
    public void log(String msg) {
        System.out.println("现在把：\"" + msg + "\"记录到文件中");
    }
}
