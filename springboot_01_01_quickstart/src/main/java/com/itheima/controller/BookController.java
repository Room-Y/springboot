package com.itheima.controller;

import com.itheima.pojo.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Java_cmr
 * @Date: 2023/2/28 - 11:45
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;

    @Value("${user2.name}")
    private String name1;

    @Value("${likes[1]}")
    private String likes1;

    @Value("${users[1].age}")
    private String users1age;

    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running……");
        System.out.println("country1=====>"+country1);
        System.out.println("name1=====>"+name1);
        System.out.println("likes1=====>"+likes1);
        System.out.println("users1age=====>"+users1age);
        System.out.println("----------------------------");
        System.out.println(env.getProperty("country"));
        System.out.println(env.getProperty("users[1].age"));
        System.out.println("----------------------------");
        System.out.println(myDataSource);
        return "springboot is running……";
    }
}
