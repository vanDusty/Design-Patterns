package cn.van.factory.demo.summary;

import cn.van.factory.demo.entity.Engine;
import cn.van.factory.demo.entity.Tire;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: EngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:17
 * Description: 整车车间
 * Version： V1.0
 */
public interface CarFactory {

    /**
     * 准备生产
     */
    void init();

    /**
     * 生产轮胎
     * @return
     */
    Tire produceTire();

    /**
     * 生产发动机
     * @return
     */
    Engine produceEngine();

}
