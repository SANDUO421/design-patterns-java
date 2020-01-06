package com.patterns.java.strategy.demo1.test01.extend;

import com.patterns.java.strategy.demo1.test01.PaymentContext;
import com.patterns.java.strategy.demo1.test01.PaymentStrategy;

/**
 * @author 三多
 * @Time 2020/1/2
 */
public class CardCash implements PaymentStrategy {
    /**
     * 支付-银行卡
     *
     * @param paymentContext 支付上下文
     */
    public void pay(PaymentContext paymentContext) {
        PayContextExtend contextExtend = (PayContextExtend)paymentContext;

        System.out.println("现在使用银行卡给:"+ contextExtend.getUsername()+"支付人民币:"
                + contextExtend.getMoney()+"元，账号是："+ contextExtend.getAccount());

    }
}
