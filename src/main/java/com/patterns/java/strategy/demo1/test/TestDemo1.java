package com.patterns.java.strategy.demo1.test;

/**
 * context 单独控制
 * <p>
 * 使用这种方式：扩展strategy
 *
 * @author 三多
 * @Time 2020/1/2
 */
public class TestDemo1 {
    public static void main(String[] args) {
        //1：选择并创建需要的策略
        Strategy strategy = new OldCustomerStrategy();
        //2：创建价格上下文
        PriceContext priceContext = new PriceContext(strategy);
        //计算报价
        double endPrice = priceContext.quote(1000);
        System.out.println("向客户报价：" + endPrice);

        //新增战略 客户
        endPrice = new PriceContext(new CooperateCustomerStrategy()).quote(1000);
        System.out.println("向客户报价：" + endPrice);
    }
}
