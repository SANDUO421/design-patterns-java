package com.patterns.java.strategy.demo1.test;

/**
 * 新增一个战略客户
 *
 * @author 三多
 * @Time 2020/1/2
 */
public class CooperateCustomerStrategy implements Strategy {
    /**
     * 计算价格
     *
     * @param goodsPrice 货物价格
     * @return double
     */
    public double calcPrice(double goodsPrice) {
        System.out.println("我是战略客户，打8折");
        return goodsPrice * (1 - 0.2);
    }
}
