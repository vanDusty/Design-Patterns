package cn.van.sfs.demo.service.impl;

import cn.van.sfs.demo.common.MemberEnum;
import cn.van.sfs.demo.service.FeeService;

/**
 * @公众号： 风尘博客
 * @Classname IntermediateMember
 * @Description 中级会员计费规则
 * @Date 2020/2/6 8:19 下午
 * @Author by Van
 */
public class IntermediateMember implements FeeService {

    /**
     * 计算中级会员所需缴费的金额
     * @param amount 会员的交易金额
     * @return
     */
    @Override
    public Double compute(Double amount) {
        // 具体的实现根据业务需求修改
        return 6.66;
    }

    @Override
    public Integer getType() {
        return MemberEnum.INTERMEDIATE_MEMBER.getCode();
    }
}
