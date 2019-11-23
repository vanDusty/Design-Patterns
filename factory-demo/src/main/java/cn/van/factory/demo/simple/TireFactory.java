package cn.van.factory.demo.simple;

import cn.van.factory.demo.entity.Tire;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: EngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:17
 * Description: 轮胎的工厂类
 * Version： V1.0
 */
public interface TireFactory {

    /**
     * 生产轮胎的方法，各个产线可以有自己的方式生产
     */
    Tire produceTire();
}
