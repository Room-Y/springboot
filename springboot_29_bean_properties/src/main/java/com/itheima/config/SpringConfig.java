package com.itheima.config;

import com.itheima.bean.Cat;
import com.itheima.bean.Mouse;
import com.itheima.bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 20:46
 */
//@Import(MyImportSelector.class)
public class SpringConfig {

    @Bean
//    @ConditionalOnClass(Mouse.class)
    @ConditionalOnBean(name="jerry")
    @ConditionalOnMissingClass("com.itheima.bean.Wolf")
    public Cat tom(){
        return new Cat();
    }
}
