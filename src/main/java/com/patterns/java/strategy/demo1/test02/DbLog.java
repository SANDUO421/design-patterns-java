package com.patterns.java.strategy.demo1.test02;

/**
 * @author 三多
 * @Time 2020/1/2
 */
public class DbLog implements LogStrategy {
    /**
     * 记录日志-记录到数据库中
     *
     * @param msg 消息
     */
    public void log(String msg) {
        //制造错误（msg>5 报错）
        if(msg != null && msg.trim().length()>5){
            int a = 5/0;
        }
        System.out.println("现在把：\""+msg + "\"记录到数据库");
    }
}
