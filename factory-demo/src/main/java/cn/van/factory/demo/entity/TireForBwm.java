package cn.van.factory.demo.entity;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: EngineFactory
 *
 * @author: Van
 * Date:     2019-11-20 23:17
 * Description: 宝马轮胎实体
 * Version： V1.0
 */
public class TireForBwm extends Tire{

    Tire tire;

    /**
     * 特有属性
     */
    private String bwm;

    public TireForBwm() {
        this.bwm = "得到 Bwm 轮胎";
    }

    @Override
    public String toString() {
        return "["+this.bwm +"]";
    }
}
