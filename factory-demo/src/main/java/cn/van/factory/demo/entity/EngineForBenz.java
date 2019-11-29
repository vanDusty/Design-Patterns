package cn.van.factory.demo.entity;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: Engine
 *
 * @author: Van
 * Date:     2019-11-20 19:28
 * Description: 奔驰发动机
 * Version： V1.0
 */
public class EngineForBenz extends Engine{

    Engine engine;
    /**
     * 特有属性
     */
    private String benz;

    public EngineForBenz() {
        this.benz = "得到 Benz 发动机";
    }

    @Override
    public String toString() {
        return "["+this.benz +"]";
    }
}
