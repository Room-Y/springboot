package com.itheima.testcase.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 19:06
 */

@Component
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {
    private int id;
    private String name;
    private String uuid;
    private long publishTime;
}
