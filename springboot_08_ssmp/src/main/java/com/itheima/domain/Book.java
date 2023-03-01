package com.itheima.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Java_cmr
 * @Date: 2023/2/28 - 20:02
 */

@Data
@NoArgsConstructor
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
