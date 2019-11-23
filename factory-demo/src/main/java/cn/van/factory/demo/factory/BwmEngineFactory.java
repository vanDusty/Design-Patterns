package cn.van.factory.demo.factory;

import cn.van.factory.demo.entity.Engine;
import cn.van.factory.demo.entity.EngineForBenz;
import cn.van.factory.demo.entity.EngineForBwm;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: BwmEngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:23
 * Description: 宝马汽车
 * Version： V1.0
 */
public class BwmEngineFactory implements EngineFactory<EngineForBwm> {

    /**
     * 生产宝马发动机
     */
    @Override
    public Engine produceEngine() {
        System.out.println("宝马发动机生产中。。。");
        return new EngineForBwm();
    }
}
