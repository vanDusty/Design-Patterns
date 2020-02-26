package cn.van.sfs.demo.service;

/**
 * @公众号： 风尘博客
 * @Classname ServiceFee
 * @Description 抽象策略接口
 * @Date 2020/2/6 8:15 下午
 * @Author by Van
 */
public interface ServiceFee {

    /**
     * 用于各计费规则实现的统一处理
     * @param amount 会员的交易金额
     * @return
     */
    Double compute(Double amount);

    /**
     * 会员级别标志
     * @return
     */
    Integer getType();

}
