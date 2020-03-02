package cn.van.strategy.spring;

import cn.van.strategy.spring.common.ServiceFeeHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @公众号： 风尘博客
 * @Classname DemoTest
 * @Description TODO
 * @Date 2020/2/7 9:22 下午
 * @Author by Van
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoTest {

    @Resource
    ServiceFeeHolder serviceFeeHolder;

    @Test
    public void test() {
        // 计算应缴纳费用
        System.out.println(serviceFeeHolder.getFee("second", 1.333));
        // 获取会员标志
        System.out.println(serviceFeeHolder.getType("second"));
        // 会员描述错误，抛 IllegalArgumentException
        System.out.println(serviceFeeHolder.getType("zero"));
    }
}
