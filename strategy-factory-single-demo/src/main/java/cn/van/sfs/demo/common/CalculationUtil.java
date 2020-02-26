package cn.van.sfs.demo.common;

import cn.van.sfs.demo.service.ServiceFeeFactory;
import cn.van.sfs.demo.service.ServiceFee;

/**
 * @公众号： 风尘博客
 * @Classname CalculationUtil
 * @Description 通过一个工具类管理计费规则的调用
 * @Date 2020/2/6 9:43 下午
 * @Author by Van
 */
public class CalculationUtil {

    /**
     * 暴露给用户的的计算方法
     * @param type 会员级别标示（参见 MemberEnum）
     * @param money 当前交易金额
     * @return 该级别会员所需缴纳的费用
     * @throws IllegalArgumentException 会员级别输入错误
     */
    public static Double getFee(int type, Double money) {

        if (type == MemberEnum.ORDINARY_MEMBER.code) {
            return money;
        }

        ServiceFee strategy = ServiceFeeFactory.getInstance().get(type);

        if (strategy == null) {
            throw new IllegalArgumentException("please input right value");
        }

        return strategy.compute(money);
    }

}
