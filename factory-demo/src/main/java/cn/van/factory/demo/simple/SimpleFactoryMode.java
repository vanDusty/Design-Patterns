package cn.van.factory.demo.simple;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: SimpleFactoryMode
 *
 * @author: Van
 * Date:     2019-11-20 23:25
 * Description: 简单工厂模式
 * Version： V1.0
 */

public class SimpleFactoryMode {

    /**
     * 通过传入的品牌调用相应产线生产相应品牌的轮胎
     * @param name
     * @return
     */
    public static TireFactory produceCar(String name) {
        if ("BenzTireFactory".equals(name)) {
            return new BenzTireFactory();
        }
        if ("BwmTireFactory".equals(name)) {
            return new BwmTireFactory();
        }
        return null;
    }

    /**
     * 简单工厂模式升级版
     * @param clazz
     * @return
     */
    public static TireFactory produceCar(Class<? extends TireFactory> clazz) {
        try {
            // 通过Java的反射来创建对象
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * 缺点：
     * 每次增加不同品牌的时候都需要在工厂方法里添加不同的条件判断；
     * 如果品牌越来越多，代码看起来非常臃肿，很不利于后期的代码维护。
     * */

}
