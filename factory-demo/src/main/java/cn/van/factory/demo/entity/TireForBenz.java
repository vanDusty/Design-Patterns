package cn.van.factory.demo.entity;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: TireForBenz
 *
 * @author: Van
 * Date:     2019-11-20 23:17
 * Description: 奔驰轮胎实体
 * Version： V1.0
 */
public class TireForBenz extends Tire{


    Tire tire;
    /**
     * 特有属性
     */
    private String benz;

    public TireForBenz() {
        this.benz = "得到 Benz 轮胎";
    }


    @Override
    public String toString() {
        return "["+this.benz +"]";
    }
}
