package com.patterns.java.strategy.demo1.test;

/**
 * @author 三多
 * @Time 2020/1/2
 */
public interface Strategy {
    /**
     * 计算价格
     * @param goodsPrice 货物价格
     * @return double
     */
    public double calcPrice(double goodsPrice);
}
