package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 15:10
 */
@Configuration
public class MsgConfig {


    @Bean
    public String msg(){
        return "bean msg";
    }
}
