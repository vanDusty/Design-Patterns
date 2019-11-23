package cn.van.factory.demo.simple;

import cn.van.factory.demo.entity.Tire;
import cn.van.factory.demo.entity.TireForBenz;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: BenzTireFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:20
 * Description: 奔驰汽车轮胎产线
 * Version： V1.0
 */
public class BenzTireFactory implements TireFactory {

    /**
     * 生产奔驰轮胎
     */
    @Override
    public Tire produceTire() {
        System.out.println("奔驰轮胎生产中。。。");
        return new TireForBenz();
    }
}
