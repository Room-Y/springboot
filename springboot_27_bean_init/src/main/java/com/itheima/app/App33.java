package com.itheima.app;

import com.itheima.config.SpringConfig3;
import com.itheima.config.SpringConfig32;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 19:45
 */
public class App32 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] s = ctx.getBeanDefinitionNames();
        for(String a : s){
            System.out.println(a);
        }

    }
}
