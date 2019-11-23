package cn.van.factory.demo.simple;

import cn.van.factory.demo.entity.TireForBwm;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: BwmTireFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:23
 * Description: 宝马汽车轮胎产线
 * Version： V1.0
 */
public class BwmTireFactory implements TireFactory {

    /**
     * 生产宝马轮胎
     */
    @Override
    public TireForBwm produceTire() {
        System.out.println("宝马轮胎生产中。。。");
        return new TireForBwm();
    }
}
