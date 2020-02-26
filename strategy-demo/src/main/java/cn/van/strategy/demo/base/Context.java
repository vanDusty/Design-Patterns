package cn.van.strategy.demo.base;

import cn.van.strategy.demo.base.Strategy;

/**
 * Copyright (C), 2015-2020, 风尘博客
 * 公众号 : 风尘博客
 * FileName: Context
 *
 * @author: Van
 * Date:     2020-02-01 14:41
 * Description:
 * Version： V1.0
 */
public class Context {

    /**
     * 拥有某种算法策略
     */
    private Strategy strategy;


    /**
     * 接入算法策略（要用哪个算法，只需要注入进来）
     * @param strategy 指定的算法策略
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 获取处理的结果（调用的是具体算法处理）
     * @param a
     * @param b
     * @return
     */
    public int getResult(int a, int b) {
        return this.strategy.calculate(a, b);
    }
}
