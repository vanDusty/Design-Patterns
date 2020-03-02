package cn.van.strategy.spring.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @公众号： 风尘博客
 * @Classname AliasEntity
 * @Description 会员信息配置类
 * @Date 2020/3/1 20:54 下午
 * @Author by Van
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "alias")
public class AliasEntity {

    private HashMap<String, String> aliasMap;

    public HashMap<String, String> getAliasMap() {
        return aliasMap;
    }

    public void setAliasMap(HashMap<String, String> aliasMap) {
        this.aliasMap = aliasMap;
    }

    /**
     * 根据描述获取该会员对应的别名
     * @param desc
     * @return
     */
    public String getEntity(String desc) {
        return aliasMap.get(desc);
    }
}
