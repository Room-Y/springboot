package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 19:45
 */
public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);

        ctx.registerBean("tom", Cat.class);
        ctx.register(Mouse.class);
        String[] s = ctx.getBeanDefinitionNames();
        for(String a : s){
            System.out.println(a);
        }

        System.out.println(ctx.getBean(Dog.class));

    }
}
