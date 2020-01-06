package com.patterns.java.strategy.demo1;

/**
 * 上下文-持有策略
 * @author 三多
 * @Time 2020/1/2
 */
public class Context {
    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy;

    /**
     * 构造函数：传入一个具体的策略对象
     * @param strategy 具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文：对客户端提供操作接口，可以有参数或者返回值
     */
    public void  contextInterface(){
        //通常会转调具体的策略对象进行算法运算
        strategy.algorithmInterface();
    }
}
