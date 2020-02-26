package cn.van.sfs.demo.service;

import cn.van.sfs.demo.service.impl.IntermediateMember;
import cn.van.sfs.demo.service.impl.JuniorMember;
import cn.van.sfs.demo.service.impl.OrdinaryMember;
import cn.van.sfs.demo.service.impl.SeniorMember;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @公众号： 风尘博客
 * @Classname ServiceFeeFactory
 * @Description 策略工厂
 * @Date 2020/2/6 8:22 下午
 * @Author by Van
 */
public class ServiceFeeFactory {

    private Map<Integer, ServiceFee> map;

    public ServiceFeeFactory() {

        // 该工厂管理所有的策略接口实现类
        List<ServiceFee> serviceFees = new ArrayList<>();

        serviceFees.add(new OrdinaryMember());
        serviceFees.add(new JuniorMember());
        serviceFees.add(new IntermediateMember());
        serviceFees.add(new SeniorMember());

        // 把所有策略实现的集合List转为Map
        map = new ConcurrentHashMap<>();
        for (ServiceFee serviceFee : serviceFees) {
            map.put(serviceFee.getType(), serviceFee);
        }
    }

    /**
     * 静态内部类单例
     */
    public static class Holder {
        public static ServiceFeeFactory instance = new ServiceFeeFactory();
    }

    /**
     * 在构造方法的时候，初始化好 需要的 ServiceFeeStrategy
     * @return
     */
    public static ServiceFeeFactory getInstance() {
        return Holder.instance;
    }

    /**
     * 根据会员的级别type 从map获取相应的策略实现类
     * @param type
     * @return
     */
    public ServiceFee get(Integer type) {
        return map.get(type);
    }
}
