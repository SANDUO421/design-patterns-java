# 1.设计模式

## 策略模式(Strategy)
### 场景（报价系统(不同规则不同的策略)，）（不同的会员打折力度不一样）
<pre>
    需求：
        1. 对普通客户或者新客户报全价
        2. 对老客户报的价格，统一折扣5%
        3. 对大客户报的价，统一折扣10%
</pre>
<pre>
    场景：
        1. 多个if-else 可以考虑使用策略模式
        2.
</pre>
### 实现比较（if-elseif、策略模式）
<pre>
   if-elseif：(平等的功能结构)
        优点：
            1. 结构简单明了
            2. 适合简单的策略判断
        缺点：
            1. 违反开-闭原则
            2. 当策略多的时候，维护非常麻烦   
   策略模式：(策略算法是相同行为的不同实现)
        优点：
           1. 各个策略算法的平等性，正式平等性才会使得算法之间可以相互的替换。
           2. 所有算法的实现都是相互独立，之间没有任何依赖  
                   
</pre>
### 模型概述
<pre>
    1. 概述：（算法、封装、相互替换、独立变化）
        定义一系列算法，将他们都分别封装，并且使他们可以相互替换。
        本模式使算法可以独立于使用它的客户而变化。
    2. 功能:
        将算法和具体的业务分离
    3. 核心：
        不是如何实现算法：而是如何组织、调用这些算法。
    4. 目的：
        让程序结构更加灵活、具有更好的维护性和扩展性。
    5. 策略算法的选择：
        1.客户端选择->传递给上下问对象
        2.客户端不负责算法选择，而实让上下文选择具体（如容错恢复）
    6. Strategy实现：
        1.可以是接口（常见方式）
        2.可以是抽象类（多个算法有公共的自定义功能）
    7. 特点：
        1.运行时策略算法的唯一性，即同一个时刻只允许一个算法使用
</pre> 
### 示例
模型参考包：com.patterns.java.strategy.demo1
策略模式-通用版（基于strategy的）参考包 ：com.patterns.java.strategy.demo1.test
策略模式-扩展版（基于context的）参考包 ：com.patterns.java.strategy.demo1.test1
策略模式-（服务降级：context 自动选择实现策略）参考包 ：com.patterns.java.strategy.demo1.test2
### 策略模式 + 模板方法模式

## 模板方法模式(Template Method)（公共算法提取--采用模板方法）

## 装饰模式(Decorator)(折上折：促销)
## 组合模式(Composite)

## 职责链模式(Chain of Responsibility)

## 工厂设计模式
### 简单工厂
### 工厂模式（Factory Method）
### 抽象工厂（Abstract Factory）

## 适配器模式（Adapter）
## 代理模式（Proxy）
## 外观者模式(Observer)
## 迭代器模式(Iterator)
## 单例模式（Singleton）
## 状态模式(State)
## 桥接模式(Bridge)
## 访问者模式(Visitor)


## 外观模式
## 生成器模式（Builder）
## 原型模式（Prototype）
## 中介者模式（Mediator）
## 解释器模式(Interpreter)
## 命令模式(Command)
## 备忘录模式(Memento)
## 享元模式(Flyweight)


# 参考
## 时间
[java8日期时间API使用及各类格式化方式：](https://blog.csdn.net/weixin_43928997/article/details/91974163)

