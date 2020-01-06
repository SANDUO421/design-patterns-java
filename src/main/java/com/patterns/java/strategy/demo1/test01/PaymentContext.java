package com.patterns.java.strategy.demo1.test01;

/**
 * @author 三多
 * @Time 2020/1/2
 */
public class PaymentContext {
    /**
     * 共享参数
     * username：用户
     */
    private String username = null;
    /**
     * 共享参数
     * money : 钱
     */
    private double money = 0.0;
    private PaymentStrategy strategy = null;

    public PaymentContext(String username, double money, PaymentStrategy strategy) {
        this.username = username;
        this.money = money;
        this.strategy = strategy;
    }

    public String getUsername() {
        return username;
    }

    public double getMoney() {
        return money;
    }

    /**
     * 公共调用
     * 将参数通过context传递
     */
    public void payNow() {
        //使用客户希望的策略支付
        strategy.pay(this);
    }
}
