package cn.van.factory.demo.summary;

import cn.van.factory.demo.entity.Engine;
import cn.van.factory.demo.entity.EngineForBwm;
import cn.van.factory.demo.entity.Tire;
import cn.van.factory.demo.entity.TireForBwm;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: EngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:17
 * Description: 宝马汽车生产
 * Version： V1.0
 */
public class BwmCarFactory implements CarFactory{


    @Override
    public void init() {
        System.out.println("----------------------- 宝马汽车准备生产 -----------------------");
    }

    @Override
    public Tire produceTire() {
        System.out.println("正在生产宝马轮胎");
        return new TireForBwm();
    }

    @Override
    public Engine produceEngine() {
        System.out.println("正在生产宝马发动机");
        return new EngineForBwm();
    }
}
