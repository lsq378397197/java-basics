package com.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 *  Java API 注册方式 注册bean
 *
 * @author liushangqing
 * @date 2022/4/6 22:55
 */
public class CustomBeanDefinitionRegistry implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        RootBeanDefinition personBean = new RootBeanDefinition(Person.class);
        // 新增 Bean
        registry.registerBeanDefinition("person", personBean);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
