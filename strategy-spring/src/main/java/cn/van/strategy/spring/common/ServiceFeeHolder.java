package cn.van.strategy.spring.common;

import cn.van.strategy.spring.service.FeeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @公众号： 风尘博客
 * @Classname ServiceFeeHolder
 * @Description 策略工厂
 * @Date 2020/2/6 8:22 下午
 * @Author by Van
 */
@Component
public class ServiceFeeHolder {

    /**
     * 将 Spring 中所有 ServiceFee 的实现类注入到这个Map中
     */
    @Resource
    private Map<String, FeeService> serviceFeeMap;

    @Resource
    private AliasEntity aliasEntity;

    /**
     * 获取该会员应当缴纳的费用
     * @param desc 会员标志
     * @param money 交易金额
     * @return
     * @throws IllegalArgumentException 会员级别输入错误
     */
    public Double getFee(String desc, Double money) {
        return getBean(desc).compute(money);
    }

    /**
     * 获取会员标志（枚举中的数字）
     * @param desc 会员标志
     * @return
     * @throws IllegalArgumentException 会员级别输入错误
     */
    public Integer getType(String desc) {
        return getBean(desc).getType();
    }

    private FeeService getBean(String type) {
        // 根据配置中的别名获取该策略的实现类
        FeeService entStrategy = serviceFeeMap.get(aliasEntity.getEntity(type));
        if (entStrategy == null) {
            // 找不到对应的策略的实现类，抛出异常
            throw new IllegalArgumentException("please input right value");
        }
        return entStrategy;
    }
}
