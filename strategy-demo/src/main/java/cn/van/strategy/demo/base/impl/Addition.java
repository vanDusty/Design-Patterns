package cn.van.strategy.demo.base.impl;

import cn.van.strategy.demo.base.Strategy;

/**
 * Copyright (C), 2015-2020, 风尘博客
 * 公众号 : 风尘博客
 * FileName: Addition
 *
 * @author: Van
 * Date:     2020-02-01 14:39
 * Description: 加法的实现
 * Version： V1.0
 */
public class Addition implements Strategy {

    public int calculate(int a, int b) {
        return a + b;
    }
}
