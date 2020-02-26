package cn.van.strategy.demo.base;

/**
 * Copyright (C), 2015-2020, 风尘博客
 * 公众号 : 风尘博客
 * FileName: Strategy
 *
 * @author: Van
 * Date:     2020-02-01 14:39
 * Description: 基础算法接口
 * Version： V1.0
 */
public interface Strategy {

    /**
     * 抽象的处理方法
     * @param a
     * @param b
     * @return
     */
    int calculate(int a, int b);
}
