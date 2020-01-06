package com.patterns.java.strategy.demo1.test01;

/**
 * 美元支付
 *
 * @author 三多
 * @Time 2020/1/2
 */
public class DollarCash implements PaymentStrategy {
    public void pay(PaymentContext paymentContext) {
        System.out.println("现在给:"+ paymentContext.getUsername()+"支付美元:"+ paymentContext.getMoney()+"元");
    }
}
