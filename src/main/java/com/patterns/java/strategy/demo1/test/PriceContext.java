package com.patterns.java.strategy.demo1.test;

/**
 * 价格上下文
 * @author 三多
 * @Time 2020/1/2
 */
public class PriceContext {
    private Strategy strategy;

    public PriceContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 公共调用
     * @param goodsPrice
     * @return
     */
    public double quote(double goodsPrice){
        return strategy.calcPrice(goodsPrice);
    }
}
