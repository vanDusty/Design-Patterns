package cn.van.sfs.demo.service.impl;

import cn.van.sfs.demo.common.MemberEnum;
import cn.van.sfs.demo.service.ServiceFee;

/**
 * @公众号： 风尘博客
 * @Classname OrdinaryMember
 * @Description 普通会员计费规则
 * @Date 2020/2/6 8:19 下午
 * @Author by Van
 */
public class OrdinaryMember implements ServiceFee {

    /**
     * 计算普通会员所需缴费的金额
     * @param amount 会员的交易金额
     * @return
     */
    @Override
    public Double compute(Double amount) {
        // 具体的实现根据业务需求修改
        return 9.99;
    }

    @Override
    public Integer getType() {
        return MemberEnum.ORDINARY_MEMBER.getCode();
    }
}
