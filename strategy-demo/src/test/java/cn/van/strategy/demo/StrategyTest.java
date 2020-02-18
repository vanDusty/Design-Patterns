package cn.van.strategy.demo;

import cn.van.strategy.demo.base.impl.Addition;
import cn.van.strategy.demo.base.impl.Subtraction;
import cn.van.strategy.demo.util.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright (C), 2015-2020, 风尘博客
 * 公众号 : 风尘博客
 * FileName: StrategyTest
 *
 * @author: Van
 * Date:     2020-02-14 14:44
 * Description: ${DESCRIPTION}
 * Version： V1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyTest {

    /**
     * 加法的策略模式实现
     */
    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Addition());
        System.out.println("计算结果为：" + calculator.getResult(1, 2));
    }

    /**
     * 减法的策略模式实现
     */
    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Subtraction());
        System.out.println("计算结果为：" + calculator.getResult(1, 2));
    }
}
