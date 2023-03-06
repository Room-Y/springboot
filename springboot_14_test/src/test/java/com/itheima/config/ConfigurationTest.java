package com.itheima.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 15:11
 */

@SpringBootTest
@Import(MsgConfig.class)
public class ConfigurationTest {

    @Autowired
    private String msg;

    @Test
    public void TestMsg(){
        System.out.println(msg);
    }
}
