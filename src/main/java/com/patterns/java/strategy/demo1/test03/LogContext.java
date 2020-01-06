package com.patterns.java.strategy.demo1.test03;

import com.patterns.java.strategy.demo1.test03.DbLog;
import com.patterns.java.strategy.demo1.test03.FileLog;
import com.patterns.java.strategy.demo1.test03.LogStrategy;

/**
 * @author 三多
 * @Time 2020/1/6
 */
public class LogContext {
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
