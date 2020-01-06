package com.patterns.java.strategy.demo1.test01;

import com.patterns.java.strategy.demo1.test01.extend.CardCash;
import com.patterns.java.strategy.demo1.test01.extend.PayContextExtend;

/**
 * 客户端:
 *      将上下文作为参数传递给策略对象
 *  使用这种方式：扩展context
 * @author 三多
 * @Time 2020/1/2
 */
public class Client {
    public static void main(String[] args) {
        //创建支付策略
        PaymentStrategy strategyRmb = new RmbCash();
        PaymentStrategy strategyDollar = new DollarCash();

        //给小李支付工资上下文-人民币
        PaymentContext contextX = new PaymentContext("小李",10000d,strategyRmb);
        contextX.payNow();
        //给小张支付工资上下文-美元
        PaymentContext contextY = new PaymentContext("小张",5000d,strategyDollar);
        contextY.payNow();

        //扩展使用卡支付-小王(通过扩展context 扩展功能或者策略)
        PaymentStrategy strategyCard = new CardCash();
        PaymentContext contextZ = new PayContextExtend("小王",8000d,"622700042877912",strategyCard);
        contextZ.payNow();
    }
}
