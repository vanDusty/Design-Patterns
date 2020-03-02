package cn.van.sfs.demo.common;

import cn.van.sfs.demo.service.FeeService;
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

    private Map<Integer, FeeService> map;

    public ServiceFeeFactory() {

        // 该工厂管理所有的策略接口实现类
        List<FeeService> feeServices = new ArrayList<>();

        feeServices.add(new OrdinaryMember());
        feeServices.add(new JuniorMember());
        feeServices.add(new IntermediateMember());
        feeServices.add(new SeniorMember());

        // 把所有策略实现的集合List转为Map
        map = new ConcurrentHashMap<>();
        for (FeeService feeService : feeServices) {
            map.put(feeService.getType(), feeService);
        }
    }

    /**
     * 静态内部类单例
     */
    public static class Holder {
        public static ServiceFeeFactory instance = new ServiceFeeFactory();
    }

    /**
     * 在构造方法的时候，初始化好 需要的 ServiceFeeFactory
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
    public FeeService get(Integer type) {
        return map.get(type);
    }
}
