package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig4;
import com.itheima.config.SpringConfig6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 19:45
 */
public class App6 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig6.class);

        String[] s = ctx.getBeanDefinitionNames();
        for(String a : s){
            System.out.println(a);
        }


    }
}
