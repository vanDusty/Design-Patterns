package cn.van.factory.demo;

import cn.van.factory.demo.entity.EngineForBenz;
import cn.van.factory.demo.entity.EngineForBwm;
import cn.van.factory.demo.entity.TireForBenz;
import cn.van.factory.demo.entity.TireForBwm;
import cn.van.factory.demo.factory.BenzEngineFactory;
import cn.van.factory.demo.factory.BwmEngineFactory;
import cn.van.factory.demo.factory.EngineFactory;
import cn.van.factory.demo.simple.BenzTireFactory;
import cn.van.factory.demo.simple.BwmTireFactory;
import cn.van.factory.demo.simple.SimpleFactoryMode;
import cn.van.factory.demo.simple.TireFactory;
import cn.van.factory.demo.summary.BenzCarFactory;
import cn.van.factory.demo.summary.BwmCarFactory;
import cn.van.factory.demo.summary.CarFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: FactoryModeTest
 *
 * @author: Van
 * Date:     2019-11-21 17:35
 * Description: ${DESCRIPTION}
 * Version： V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryModeTest {

    /**
     * 普通工厂模式
     */
    @Test
    public void simpleFactoryModeTest() {
        // 造奔驰轮胎
        TireFactory benz = SimpleFactoryMode.produceCar("BenzTireFactory");
        if (null != benz) {
            benz.produceTire();
        }else {
            System.out.println("工厂暂时无法生产奔驰轮胎");
        }
        // 造宝马轮胎
        TireFactory bwm = SimpleFactoryMode.produceCar("BwmTireFactory");
        if (null != bwm) {
            bwm.produceTire();
        }else {
            System.out.println("工厂暂时无法生产宝马轮胎");
        }
        // 造本田汽轮胎(工厂无该方法)
        TireFactory honda = SimpleFactoryMode.produceCar("Honda");
        if (null != honda) {
            honda.produceTire();
        }else {
            System.out.println("工厂暂时无法生产本田轮胎");
        }
    }

    /**
     * 简单工厂模式优化
     */
    @Test
    public void simpleFactoryModeUpgradeTest() {
        // 造奔驰轮胎
        TireFactory benzTire = SimpleFactoryMode.produceCar(BenzTireFactory.class);
        TireForBenz benz = (TireForBenz) benzTire.produceTire();
        System.out.println(benz.toString());
        // 造宝马轮胎
        TireFactory bwmTire = SimpleFactoryMode.produceCar(BwmTireFactory.class);
        TireForBwm bwm = (TireForBwm) bwmTire.produceTire();
        System.out.println(bwm.toString());
    }

    /**
     * 工厂方法模式
     */
    @Test
    public void factoryModeTest() {
        // 造奔驰发动机
        EngineFactory car = new BenzEngineFactory();
        EngineForBenz benz = (EngineForBenz) car.produceEngine();
        System.out.println(benz.toString());
        // 造宝马发动机
        EngineFactory carFactory = new BwmEngineFactory();
        EngineForBwm bwm = (EngineForBwm) carFactory.produceEngine();
        System.out.println(bwm.toString());
    }

    /**
     * 抽象工厂模式
     */
    @Test
    public void abstractFactoryModeTest() {
        // 生产奔驰整车的零部件
        CarFactory benz = new BenzCarFactory();
        benz.init();
        TireForBenz benzTire = (TireForBenz) benz.produceTire();
        System.out.println(benzTire.toString());

        EngineForBenz benzEngine = (EngineForBenz) benz.produceEngine();
        System.out.println(benzEngine.toString());

        // 生成宝马整车的零部件d
        CarFactory bwm = new BwmCarFactory();
        bwm.init();
        TireForBwm bwmTire = (TireForBwm) bwm.produceTire();
        System.out.println(bwmTire.toString());

        EngineForBwm bwmEngine = (EngineForBwm) bwm.produceEngine();
        System.out.println(bwmEngine.toString());
    }
}
