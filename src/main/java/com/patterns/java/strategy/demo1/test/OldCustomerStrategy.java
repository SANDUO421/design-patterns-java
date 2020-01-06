package com.patterns.java.strategy.demo1.test;

/**
 * 老客户
 * @author 三多
 * @Time 2020/1/2
 */
public class OldCustomerStrategy implements Strategy {
    /**
     * 计算价格
     *
     * @param goodsPrice 货物价格
     * @return double
     */
    public double calcPrice(double goodsPrice) {
        System.out.println("我是老顾客");
        return goodsPrice * (1-0.05);
    }
}
