package cn.van.factory.demo.summary;

import cn.van.factory.demo.entity.Engine;
import cn.van.factory.demo.entity.EngineForBenz;
import cn.van.factory.demo.entity.Tire;
import cn.van.factory.demo.entity.TireForBenz;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: EngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:17
 * Description: 奔驰汽车生产
 * Version： V1.0
 */
public class BenzCarFactory implements CarFactory{


    @Override
    public void init() {
        System.out.println("----------------------- 奔驰汽车准备生产 -----------------------");
    }

    @Override
    public Tire produceTire() {
        System.out.println("正在生产奔驰轮胎");
        return new TireForBenz();
    }

    @Override
    public Engine produceEngine() {
        System.out.println("正在生产奔驰发动机");
        return new EngineForBenz();
    }
}
