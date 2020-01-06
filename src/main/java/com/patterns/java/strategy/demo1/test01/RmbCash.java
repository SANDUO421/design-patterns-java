package com.patterns.java.strategy.demo1.test01;

/**
 * 人民币支付
 *
 * @author 三多
 * @Time 2020/1/2
 */
public class RmbCash implements PaymentStrategy {
    public void pay(PaymentContext paymentContext) {
        System.out.println("现在给:"+ paymentContext.getUsername()+"支付人民币:"+ paymentContext.getMoney()+"元");
    }
}
