package cn.van.factory.demo.factory;

import cn.van.factory.demo.entity.Engine;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: EngineFactory
 *
 * @author: Van
 * Date:     2019-11-21 00:57
 * Description: 发动机的工厂类
 * Version： V1.0
 */
public interface EngineFactory<T> {

    /**
     * 生产发动机的方法，各个产线可以有自己的方式生产
     */
    Engine produceEngine();

}
