package cn.van.sfs.demo;

import cn.van.sfs.demo.common.CalculationUtil;
import org.junit.Test;

/**
 * @公众号： 风尘博客
 * @Classname DemoTest
 * @Description TODO
 * @Date 2020/2/7 9:22 下午
 * @Author by Van
 */
public class DemoTest {

    @Test
    public void test() {
        // 常规写法
        Double fee = commonMethod(1, 20000.00);
        System.out.println(fee);
        // 优化写法
        Double fees = upMethod(1,20000.00);
        System.out.println(fees);
        // 会员级别超范围，抛 IllegalArgumentException
        Double feee = upMethod(5, 20000.00);
    }

    public Double upMethod(Integer type, Double amount) {
        // getFee（）是暴露给用户的的计算方法
        return CalculationUtil.getFee(type, amount);
    }

    public Double commonMethod(Integer type, Double amount) {
        if (3 == type) {
            // 计算费用
            if (true) {
                // 此处省略200行代码，包含n个if-else，下同。。。
            }
            return 0.00;
        } else if (2 == type) {
            // 计算费用
            return 6.66;
        }else if (1 == type) {
            // 计算费用
            return 8.88;
        }else if (0 == type){
            return 9.99;
        }
        throw new IllegalArgumentException("please input right value");
    }
}
