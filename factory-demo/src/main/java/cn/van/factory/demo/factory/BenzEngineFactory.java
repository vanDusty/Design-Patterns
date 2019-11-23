package cn.van.factory.demo.factory;

import cn.van.factory.demo.entity.Engine;
import cn.van.factory.demo.entity.EngineForBenz;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: BenzEngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:20
 * Description: 奔驰汽车
 * Version： V1.0
 */
public class BenzEngineFactory implements EngineFactory<EngineForBenz> {

    /**
     * 生产奔驰发动机
     */
    @Override
    public Engine produceEngine() {
        System.out.println("奔驰发动机生产中。。。");
        return new EngineForBenz();
    }
}
