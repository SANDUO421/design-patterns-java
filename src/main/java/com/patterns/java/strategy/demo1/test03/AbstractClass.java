package com.patterns.java.strategy.demo1.test03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author 三多
 * @Time 2020/1/6
 */
public abstract class AbstractClass implements LogStrategy {
    /**
     * @param msg
     */
    @Override
    public final void log(String msg) {
        //第一步：为消息添加时间信息
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS", Locale.CHINA);
        msg = df.format(LocalDateTime.now()) + "内容是:" + msg;
        System.out.println(msg.length());
        //第二步：执行真正的日志记录
        dolog(msg);
    }

    /**
     * 真正记录日志信息的，子类实现
     *
     * @param msg
     */
    protected abstract void dolog(String msg);

    public static void main(String[] args) throws InterruptedException {
        //本地格式化
        String localFormat = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now());
        System.out.println(localFormat);
        //自定义格式化
        String defineFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        System.out.println(defineFormat);
        Instant nowTime = Instant.now();
        System.out.println(nowTime);
        Instant start = Instant.now();
        Thread.sleep(10);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();
        System.out.println("millis = " + millis);
    }
}
