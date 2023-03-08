package com.itheima.config;

import com.itheima.bean.Dog;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author: Java_cmr
 * @Date: 2023/3/6 - 19:30
 */

@Import({Dog.class, DBConfig.class})
public class SpringConfig4 {
}
