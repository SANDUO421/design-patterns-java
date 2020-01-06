package com.patterns.java.strategy.demo1.test01;

/**
 * 支付策略
 * @author 三多
 * @Time 2020/1/2
 */
public interface PaymentStrategy {
    /**
     * 支付
     * @param paymentContext 支付上下文
     */
    public void pay(PaymentContext paymentContext);
}
