package com.patterns.java.strategy.demo1.test;

/**
 * 正常客户
 * @author 三多
 * @Time 2020/1/2
 */
public class NormalCustomerStrategy implements Strategy {
    public double calcPrice(double goodsPrice) {
        System.out.println("我是新客户/普通客户");
        return goodsPrice;
    }
}
