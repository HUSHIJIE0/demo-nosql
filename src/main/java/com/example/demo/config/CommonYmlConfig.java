package com.example.demo.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Properties;

/**
 * @program: jeecg-boot
 * @description: CommonYmlConfig
 * @author: Michael
 * @create: 2019-07-07 12:09
 */
public class CommonYmlConfig {

    /**
     * 获取配置文件里面的内容
     *
     * @param key     属性的key值
     * @param proName 配置文件的名称
     * @return
     */
    public static Object getCommonYml(String key, String proName) {
        Resource resource = new ClassPathResource(proName);
        Properties properties = null;
        try {
            YamlPropertiesFactoryBean yamlFactory = new YamlPropertiesFactoryBean();
            yamlFactory.setResources(resource);
            properties = yamlFactory.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return properties.get(key);
    }

    public static void main(String[] args) {
        System.out.println(getCommonYml("aliyun.user.accessKey", "application-dev.yml"));
    }

}
