package com.itheima.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 20:21
 */
public class MyRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition beandef = BeanDefinitionBuilder.rootBeanDefinition(Dog.class).getBeanDefinition();
        registry.registerBeanDefinition("yellow",beandef);
    }
}
