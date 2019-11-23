package cn.van.factory.demo.simple;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: SimpleFactoryMode
 *
 * @author: Van
 * Date:     2019-11-20 23:25
 * Description: 简单工厂模式(升级)
 * Version： V1.0
 */

public class SimpleFactoryModeUpgrade {


    /**
     * 通过传入的品牌生产相应品牌的车
     * @param clazz
     * @return
     */
    // public static TireFactory produceCar(Class<? extends TireFactory> clazz) {
    //     try {
    //         // 通过Java的反射来创建对象
    //         return clazz.newInstance();
    //         // return Class.forName()
    //     } catch (InstantiationException e) {
    //         e.printStackTrace();
    //     } catch (IllegalAccessException e) {
    //         e.printStackTrace();
    //     }
    //     return null;
    // }

    /**
     * 命令工厂开始造不同的车
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // // 造奔驰车
        // produceCar(BenzTireFactory.class).produceTire();
        // // 造宝马车
        // produceCar(BwmTireFactory.class).produceTire();
    }

    /**
     * 优势：
     * 不要通过手机品牌名称来判断需要创建哪一中对象了，而是客户端想要创建什么对象，只需要传入具体的实现类就可以了，然后通过Java的反射来创建对象
     *
     * 缺点：
     * 每次创建对象都是通过反射来创建的，所以在性能上是有一定的损耗
     * */

}
