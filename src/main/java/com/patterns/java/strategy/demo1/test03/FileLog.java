package com.patterns.java.strategy.demo1.test03;

/**
 * @author 三多
 * @Time 2020/1/6
 */
public class FileLog extends AbstractClass {
    /**
     * 真正记录日志信息的，子类实现
     *
     * @param msg
     */
    @Override
    protected void dolog(String msg) {
        System.out.println("现在把：\"" + msg + "\"记录到文件中");
    }
}
