package cn.van.factory.demo.entity;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: Engine
 *
 * @author: Van
 * Date:     2019-11-20 19:28
 * Description: 宝马发动机
 * Version： V1.0
 */
public class EngineForBwm extends Engine{

    Engine engine;
    /**
     * 特有属性
     */
    private String bwm;

    public EngineForBwm() {
        this.bwm = "得到 Bwm 发动机";
    }

    @Override
    public String toString() {
        return "["+this.bwm +"]";
    }
}
