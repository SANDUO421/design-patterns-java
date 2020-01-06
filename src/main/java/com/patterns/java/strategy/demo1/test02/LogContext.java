package com.patterns.java.strategy.demo1.test02;

/**
 * 日志context
 *
 * @author 三多
 * @Time 2020/1/2
 */
public class LogContext {
    /**
     * 记录日志提供给客户端使用
     * @param msg 需要记录的日志信息
     */
    public void log(String msg){
        //在上下文中，自行实现对具体策略的选择
        //优先选用策略，记录到数据库
        LogStrategy strategy = new DbLog();
        try {
            strategy.log(msg);
        }catch (Exception ex){
            //出错了
            strategy = new FileLog();
            strategy.log(msg);
        }

    }
}
