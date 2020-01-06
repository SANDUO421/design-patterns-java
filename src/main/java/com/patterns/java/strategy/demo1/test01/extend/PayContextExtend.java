package com.patterns.java.strategy.demo1.test01.extend;

import com.patterns.java.strategy.demo1.test01.PaymentContext;
import com.patterns.java.strategy.demo1.test01.PaymentStrategy;

/**
 * 扩展 银行卡支付
 *
 * @author 三多
 * @Time 2020/1/2
 */
public class PayContextExtend extends PaymentContext {

    /**
     * 银行账号
     */
    private String account = null;

    public PayContextExtend(String username, double money, String account, PaymentStrategy strategy) {
        super(username, money, strategy);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}
