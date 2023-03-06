package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(properties = {"test.prop=testvalue11"})
@SpringBootTest(args={"--test.prop=testValue22"}, properties = {"test.prop=testvalue11"})
class Springboot14TestApplicationTests {

    @Value("${test.prop}")
    private String msg;

    @Test
    void contextLoads() {
        System.out.println(msg);
    }

}
