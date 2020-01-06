package com.patterns.java.strategy.demo1.test03;

/**
 * 记录到数据库
 * @author 三多
 * @Time 2020/1/6
 */
public class DbLog extends AbstractClass {
    /**
     * 真正记录日志信息的，子类实现
     *
     * @param msg
     */
    @Override
    protected void dolog(String msg) {
        //制造错误（msg>5 报错）
        if(msg != null && msg.trim().length()>31){
            int a = 5/0;
        }
        System.out.println("现在把：\""+msg + "\"记录到数据库");
    }
}
