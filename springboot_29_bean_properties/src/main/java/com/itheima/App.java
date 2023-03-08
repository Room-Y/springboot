package com.itheima;

import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 20:44
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        for (String s : ctx.getBeanDefinitionNames()) {
            System.out.println(s);
        }

    }
}
